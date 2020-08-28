// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTrainTicketResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeTrainTicketResponseData data;

    public static RecognizeTrainTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTrainTicketResponse self = new RecognizeTrainTicketResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeTrainTicketResponseData extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("Destination")
        @Validation(required = true)
        public String destination;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Number")
        @Validation(required = true)
        public String number;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("DepartureStation")
        @Validation(required = true)
        public String departureStation;

        @NameInMap("Seat")
        @Validation(required = true)
        public String seat;

        @NameInMap("Price")
        @Validation(required = true)
        public Double price;

        public static RecognizeTrainTicketResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTrainTicketResponseData self = new RecognizeTrainTicketResponseData();
            return TeaModel.build(map, self);
        }

    }

}
