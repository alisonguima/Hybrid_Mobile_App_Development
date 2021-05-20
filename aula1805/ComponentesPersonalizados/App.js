import React from 'react'
import {
  SafeAreaView,
} from 'react-native'

import CheckBox from './componentes/CheckBox'

class App extends React.Component {

  state = {
    check01 : false,
    check02 : false,
    check03 : false
  }

  render() {
    return (
      <SafeAreaView>
        <CheckBox 
          checked={this.state.check01}
          onChecked={ (status) => this.setState({ check01 : status}) }
          text="Texto 01" />
        <CheckBox 
          checked={this.state.check02}
          onChecked={ (status) => this.setState({ check02 : status}) } />
        <CheckBox 
          checked={this.state.check03}
          onChecked={ (status) => this.setState({ check03 : status}) } />
      </SafeAreaView>
    )
  }
}

export default App