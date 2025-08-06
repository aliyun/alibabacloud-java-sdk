// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaDNALibsResponseBody extends TeaModel {
    @NameInMap("AIDNALibInfoList")
    public ListMediaDNALibsResponseBodyAIDNALibInfoList AIDNALibInfoList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListMediaDNALibsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaDNALibsResponseBody self = new ListMediaDNALibsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaDNALibsResponseBody setAIDNALibInfoList(ListMediaDNALibsResponseBodyAIDNALibInfoList AIDNALibInfoList) {
        this.AIDNALibInfoList = AIDNALibInfoList;
        return this;
    }
    public ListMediaDNALibsResponseBodyAIDNALibInfoList getAIDNALibInfoList() {
        return this.AIDNALibInfoList;
    }

    public ListMediaDNALibsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo extends TeaModel {
        @NameInMap("FpDBId")
        public String fpDBId;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("State")
        public String state;

        public static ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo self = new ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo();
            return TeaModel.build(map, self);
        }

        public ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListMediaDNALibsResponseBodyAIDNALibInfoList extends TeaModel {
        @NameInMap("AIDNALibInfo")
        public java.util.List<ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo> AIDNALibInfo;

        public static ListMediaDNALibsResponseBodyAIDNALibInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaDNALibsResponseBodyAIDNALibInfoList self = new ListMediaDNALibsResponseBodyAIDNALibInfoList();
            return TeaModel.build(map, self);
        }

        public ListMediaDNALibsResponseBodyAIDNALibInfoList setAIDNALibInfo(java.util.List<ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo> AIDNALibInfo) {
            this.AIDNALibInfo = AIDNALibInfo;
            return this;
        }
        public java.util.List<ListMediaDNALibsResponseBodyAIDNALibInfoListAIDNALibInfo> getAIDNALibInfo() {
            return this.AIDNALibInfo;
        }

    }

}
