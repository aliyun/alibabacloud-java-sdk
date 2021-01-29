// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTrainTicketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeTrainTicketResponseBodyData data;

    public static RecognizeTrainTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTrainTicketResponseBody self = new RecognizeTrainTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeTrainTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeTrainTicketResponseBody setData(RecognizeTrainTicketResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeTrainTicketResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeTrainTicketResponseBodyData extends TeaModel {
        @NameInMap("Price")
        public Float price;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("DepartureStation")
        public String departureStation;

        @NameInMap("Date")
        public String date;

        @NameInMap("Number")
        public String number;

        @NameInMap("Seat")
        public String seat;

        @NameInMap("Name")
        public String name;

        @NameInMap("Level")
        public String level;

        public static RecognizeTrainTicketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeTrainTicketResponseBodyData self = new RecognizeTrainTicketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeTrainTicketResponseBodyData setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public RecognizeTrainTicketResponseBodyData setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public RecognizeTrainTicketResponseBodyData setDepartureStation(String departureStation) {
            this.departureStation = departureStation;
            return this;
        }
        public String getDepartureStation() {
            return this.departureStation;
        }

        public RecognizeTrainTicketResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public RecognizeTrainTicketResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public RecognizeTrainTicketResponseBodyData setSeat(String seat) {
            this.seat = seat;
            return this;
        }
        public String getSeat() {
            return this.seat;
        }

        public RecognizeTrainTicketResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeTrainTicketResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
