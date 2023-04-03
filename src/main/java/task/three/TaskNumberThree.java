package task.three;

public class TaskNumberThree {

//    void processTask(ChannelHandlerContext ctx) {
//        InetSocketAddress lineAddress = new InetSocketAddress(getIpAddress(), getUdpPort());  CommandType typeToRemove;
//        for (Command currentCommand : getAllCommands()) {
//            if (currentCommand.getCommandType() == CommandType.REBOOT_CHANNEL) {
//                sendCommand(ctx, lineAddress, currentCommand, () -> currentCommand.setSendDate(new Date()));
//            } else {
//                sendCommand(ctx, lineAddress, currentCommand, () -> currentCommand.incSendCounter());
//            }
//        }
//        sendKeepAliveOkAndFlush(ctx);
//    }
//
//
//    void sendCommand(ChannelHandlerContext ctx, InetSocketAddress lineAddress, Command currentCommand, MarkCommand marker) {
//        if (!currentCommand.isAttemptsNumberExhausted()) {
//            sendCommandToContext(ctx, lineAddress, currentCommand.getCommandText());
//            try {
//                AdminController.getInstance().processUssdMessage(
//                        new DblIncomeUssdMessage(lineAddress.getHostName(), lineAddress.getPort(), 0,
//                                                    EnumGoip.getByModel(getGoipModel()), currentCommand.getCommandText()), false);
//            } catch (Exception ignored) {
//            }
//            Log.ussd.write(String.format("sent: ip: %s; порт: %d; %s",
//                    lineAddress.getHostString(), lineAddress.getPort(), currentCommand.getCommandText()));  currentCommand.setSendDate(new Date());
//            marker.mark();
//        } else {
//            typeToRemove = currentCommand.getCommandType();
//            deleteCommand(typeToRemove);
//        }
//    }
//
//    private interface MarkCommand {
//        void mark();
//    }

}
