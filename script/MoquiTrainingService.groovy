if(!trainingName){
    ec.message.addError("trainingName is required")
    return
}

def tutorial = ec.entity.makeValue("moqui.MoquiTrainingEntity")
tutorial.setAll(ec.context)
if (!tutorial.trainingId) tutorial.setSequencedIdPrimary()
tutorial.create()
ec.context.responseMessage = "Training [${trainingName}] created successfully!"