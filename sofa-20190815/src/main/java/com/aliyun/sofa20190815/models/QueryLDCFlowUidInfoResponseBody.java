// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFlowUidInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UidInfoList")
    public java.util.List<QueryLDCFlowUidInfoResponseBodyUidInfoList> uidInfoList;

    public static QueryLDCFlowUidInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFlowUidInfoResponseBody self = new QueryLDCFlowUidInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCFlowUidInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCFlowUidInfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCFlowUidInfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCFlowUidInfoResponseBody setUidInfoList(java.util.List<QueryLDCFlowUidInfoResponseBodyUidInfoList> uidInfoList) {
        this.uidInfoList = uidInfoList;
        return this;
    }
    public java.util.List<QueryLDCFlowUidInfoResponseBodyUidInfoList> getUidInfoList() {
        return this.uidInfoList;
    }

    public static class QueryLDCFlowUidInfoResponseBodyUidInfoList extends TeaModel {
        @NameInMap("CurrentGroup")
        public String currentGroup;

        @NameInMap("DefaultGroup")
        public String defaultGroup;

        @NameInMap("Elastic")
        public Boolean elastic;

        @NameInMap("Gray")
        public Boolean gray;

        @NameInMap("Press")
        public Boolean press;

        @NameInMap("Uid")
        public Long uid;

        public static QueryLDCFlowUidInfoResponseBodyUidInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCFlowUidInfoResponseBodyUidInfoList self = new QueryLDCFlowUidInfoResponseBodyUidInfoList();
            return TeaModel.build(map, self);
        }

        public QueryLDCFlowUidInfoResponseBodyUidInfoList setCurrentGroup(String currentGroup) {
            this.currentGroup = currentGroup;
            return this;
        }
        public String getCurrentGroup() {
            return this.currentGroup;
        }

        public QueryLDCFlowUidInfoResponseBodyUidInfoList setDefaultGroup(String defaultGroup) {
            this.defaultGroup = defaultGroup;
            return this;
        }
        public String getDefaultGroup() {
            return this.defaultGroup;
        }

        public QueryLDCFlowUidInfoResponseBodyUidInfoList setElastic(Boolean elastic) {
            this.elastic = elastic;
            return this;
        }
        public Boolean getElastic() {
            return this.elastic;
        }

        public QueryLDCFlowUidInfoResponseBodyUidInfoList setGray(Boolean gray) {
            this.gray = gray;
            return this;
        }
        public Boolean getGray() {
            return this.gray;
        }

        public QueryLDCFlowUidInfoResponseBodyUidInfoList setPress(Boolean press) {
            this.press = press;
            return this;
        }
        public Boolean getPress() {
            return this.press;
        }

        public QueryLDCFlowUidInfoResponseBodyUidInfoList setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

}
