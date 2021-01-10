// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDWSTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<DescribeDWSTaskResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeDWSTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDWSTaskResponseBody self = new DescribeDWSTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDWSTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDWSTaskResponseBody setData(java.util.List<DescribeDWSTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDWSTaskResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDWSTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeDWSTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeDWSTaskResponseBodyData extends TeaModel {
        @NameInMap("Number")
        public Long number;

        @NameInMap("NewTaskStatus")
        public String newTaskStatus;

        public static DescribeDWSTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDWSTaskResponseBodyData self = new DescribeDWSTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDWSTaskResponseBodyData setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public DescribeDWSTaskResponseBodyData setNewTaskStatus(String newTaskStatus) {
            this.newTaskStatus = newTaskStatus;
            return this;
        }
        public String getNewTaskStatus() {
            return this.newTaskStatus;
        }

    }

}
