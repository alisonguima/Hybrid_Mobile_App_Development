import React from 'react'
import{
  StyleSheet,
  Text,
  Touchable,
  TouchableOpacity,
  View
} from 'react-native'

class CheckBox extends React.Component {
    state = {
       isChecked : this.props.checked
    }

  render(){

    const quadrado = [estilos.checkbox]

    if (this.state.isChecked){
        quadrado.push(estilos.checkboxAtivo)
    }

      return(
        <TouchableOpacity 
            activeOpacity={ 0.6 }
            onPress={ () => {
                const newValue = !this.state.isChecked
                this.setState({ isChecked : newValue })

                if ( typeof this.props.onChecked === 'function' ){
                    this.props.onChecked(newValue)
                }
            }}
            style={ estilos.containerCheckbox }>
        
            <View style={ quadrado }/>
        
            <Text>{ this.props.text || 'Texto default' }</Text>
        </TouchableOpacity>
      )
  }
}

const estilos = StyleSheet.create({
  containerCheckbox:{
    alignItems: 'center',
    flexDirection: 'row',
    padding: 8
  },
  checkbox: {
    borderColor: '#CCC',
    borderRadius: 5,
    borderWidth: 1,
    height : 18,
    marginRight: 8,
    width: 18
  },
  checkboxAtivo : {
    backgroundColor : '#0F0'
  }
})

export default CheckBox