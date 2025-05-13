import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Great Lakes Game',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
      ),
      home: const GreatLakesGame(),
    );
  }
}

class GreatLakesGame extends StatefulWidget {
  const GreatLakesGame({super.key});

  @override
  State<GreatLakesGame> createState() => _GreatLakesGameState();
}

class _GreatLakesGameState extends State<GreatLakesGame> {
  final Set<String> answers = {'superior', 'michigan', 'huron', 'erie', 'ontario'};
  final Set<String> guessed = {};
  final Set<String> correct = {};
  

  

  


  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
                title: const Text('Great Lakes Game'),
              ),
              body: Center(
                child: const Text('Welcome to the Great Lakes Game!'),
              ),
            );
          }
        }