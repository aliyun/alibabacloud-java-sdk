// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListCASSlsProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListCASSlsProjectResponseBodyData> data;

    public static ListCASSlsProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCASSlsProjectResponseBody self = new ListCASSlsProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCASSlsProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCASSlsProjectResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCASSlsProjectResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListCASSlsProjectResponseBody setData(java.util.List<ListCASSlsProjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCASSlsProjectResponseBodyData> getData() {
        return this.data;
    }

    public static class ListCASSlsProjectResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static ListCASSlsProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCASSlsProjectResponseBodyData self = new ListCASSlsProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCASSlsProjectResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCASSlsProjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
