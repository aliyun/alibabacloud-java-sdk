// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_cmp20220303.models;

import com.aliyun.tea.*;

public class CheckNotaryResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public CheckNotaryResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CheckNotaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckNotaryResponseBody self = new CheckNotaryResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckNotaryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CheckNotaryResponseBody setData(CheckNotaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckNotaryResponseBodyData getData() {
        return this.data;
    }

    public CheckNotaryResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CheckNotaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckNotaryResponseBodyData extends TeaModel {
        @NameInMap("blockHash")
        public String blockHash;

        @NameInMap("blockHeight")
        public Long blockHeight;

        @NameInMap("reason")
        public String reason;

        @NameInMap("result")
        public Boolean result;

        @NameInMap("saveTime")
        public String saveTime;

        @NameInMap("txHash")
        public String txHash;

        public static CheckNotaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckNotaryResponseBodyData self = new CheckNotaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckNotaryResponseBodyData setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public CheckNotaryResponseBodyData setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public CheckNotaryResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CheckNotaryResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

        public CheckNotaryResponseBodyData setSaveTime(String saveTime) {
            this.saveTime = saveTime;
            return this;
        }
        public String getSaveTime() {
            return this.saveTime;
        }

        public CheckNotaryResponseBodyData setTxHash(String txHash) {
            this.txHash = txHash;
            return this;
        }
        public String getTxHash() {
            return this.txHash;
        }

    }

}
