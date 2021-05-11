import React from 'react'
import{
  Button,
  StyleSheet,
  Text,
  TextInput,
  TouchableOpacity,
  TouchableHighlight,
  View,
  Switch,
  Image
} from 'react-native'

import natureza from './assets/img/natureza.jpg'

class App extends React.Component {

  state = {
    isSwitchEnabled : false
  }

  render(){
    return(
    <View style = { styles.container }>
      <Text>Digite seu nome:</Text>
      <TextInput 
      autoFocus= {true}
      editable= {true}
      maxLength= {100}
      multiline= {true}
      onFocus= { () => alert('TextInput recebeu focus!') }
      keyboardType= 'name-phone-pad'
      placeholder= 'Ex.: Alison Guimarães'
      style = {styles.input }
      textAlignVertical= 'top'/>

      <Button 
      color='#000'
      onPress={ () => alert('Button pressionado!')}
      title='Clique-me'/>

      <TouchableOpacity
        activeOpacity = {0.6}
        onPress= { () => alert('TouchableOpacity pressionado!')}>
        <Text style = { styles.button }>Clique-me</Text>
      </TouchableOpacity>

      <TouchableHighlight
        onPress={ () => alert('TouchableHighLight pressionado!')}
        underlayColor='#000'>
        <Text style = { styles.button }>clique-me</Text>
      </TouchableHighlight>
      <View style = {{ flexDirection: 'row' }}>
        <Text>Ativar opção?</Text>
        <Switch 
          onValueChange = { () => this.setState({ isSwitchEnabled : !this.state.isSwitchEnabled})}
          value= {this.state.isSwitchEnabled} />
      </View>

      { this.state.isSwitchEnabled && (
        <Image 
          resizeMode= 'cover'
          source= { natureza }
          style= {{ height: 200, width: 300}} />
      )}
    
    </View>
    )
  }
}

const styles = StyleSheet.create({
  button : {
    alignSelf: 'center',
    backgroundColor: '#0F0',
    borderRadius: 10,
    color: '#000',
    margin: 8,
    padding: 10,
    textAlign : 'center',
    width: 150
  },
  container : {
    padding : 16
  },
  input : {
    borderColor : '#CCC',
    borderRadius : 10,
    borderWidth : 1,
    height: 100,
    marginTop : 8,
    marginBottom: 8,
    padding : 10
  }
})

export default App