// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetObjectScanEventResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetObjectScanEventResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetObjectScanEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetObjectScanEventResponseBody self = new GetObjectScanEventResponseBody();
        return TeaModel.build(map, self);
    }

    public GetObjectScanEventResponseBody setData(GetObjectScanEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetObjectScanEventResponseBodyData getData() {
        return this.data;
    }

    public GetObjectScanEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetObjectScanEventResponseBodyDataDetails extends TeaModel {
        @NameInMap("InfoType")
        public String infoType;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameDisplay")
        public String nameDisplay;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueDisplay")
        public String valueDisplay;

        public static GetObjectScanEventResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            GetObjectScanEventResponseBodyDataDetails self = new GetObjectScanEventResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public GetObjectScanEventResponseBodyDataDetails setInfoType(String infoType) {
            this.infoType = infoType;
            return this;
        }
        public String getInfoType() {
            return this.infoType;
        }

        public GetObjectScanEventResponseBodyDataDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetObjectScanEventResponseBodyDataDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public GetObjectScanEventResponseBodyDataDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetObjectScanEventResponseBodyDataDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetObjectScanEventResponseBodyDataDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class GetObjectScanEventResponseBodyData extends TeaModel {
        @NameInMap("Details")
        public java.util.List<GetObjectScanEventResponseBodyDataDetails> details;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Md5")
        public String md5;

        public static GetObjectScanEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetObjectScanEventResponseBodyData self = new GetObjectScanEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetObjectScanEventResponseBodyData setDetails(java.util.List<GetObjectScanEventResponseBodyDataDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<GetObjectScanEventResponseBodyDataDetails> getDetails() {
            return this.details;
        }

        public GetObjectScanEventResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetObjectScanEventResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetObjectScanEventResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

    }

}
