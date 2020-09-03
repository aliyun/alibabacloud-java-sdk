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

    public RecognizeTrainTicketResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeTrainTicketResponse setData(RecognizeTrainTicketResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeTrainTicketResponseData getData() {
        return this.data;
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
        public Float price;

        public static RecognizeTrainTicketResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTrainTicketResponseData self = new RecognizeTrainTicketResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeTrainTicketResponseData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public RecognizeTrainTicketResponseData setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public RecognizeTrainTicketResponseData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public RecognizeTrainTicketResponseData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public RecognizeTrainTicketResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeTrainTicketResponseData setDepartureStation(String departureStation) {
            this.departureStation = departureStation;
            return this;
        }
        public String getDepartureStation() {
            return this.departureStation;
        }

        public RecognizeTrainTicketResponseData setSeat(String seat) {
            this.seat = seat;
            return this;
        }
        public String getSeat() {
            return this.seat;
        }

        public RecognizeTrainTicketResponseData setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

    }

}
