import React from 'react'

import {
    StyleSheet,
    Text,
    View
} from 'react-native'

class App extends React.Component {
    render() {
        return ( 
        <View style={styles.container }>
            <Text
            ellipsizeMode= 'tail'
            numberOfLines = { 1 }
            selectable = {true} 
            style={styles.texto}> 
            Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
            Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
            when an unknown printer took a galley of type and scrambled it to make a type 
            specimen book. 
            </Text>  

            <View style= {styles.retangulo}></View>
            <View style= {styles.retangulo}></View>
            <View style= {styles.retangulo}></View>
            <View style= {styles.retangulo}></View>
        </View >
        )
    }
}

const styles = StyleSheet.create({
    container : {
        backgroundColor: '#F00',
        flex : 1,
        padding : 30
    },
    texto: {
        color : '#FFF', 
        fontSize : 20,
        textAlign : 'center'
    },
    retangulo : {
        alignSelf : 'center', 
        backgroundColor: '#333', 
        borderRadius : 10,
        marginTop: 16, 
        height : 100, 
        width : 300
    }
})

export default App