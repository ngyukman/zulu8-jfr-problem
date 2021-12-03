package com;

import jdk.jfr.events.SocketWriteEvent;

public class Test
{
    public static void main()
    {
        SocketWriteEvent event = new SocketWriteEvent();
        event.begin();
        event.commit();
    }
}