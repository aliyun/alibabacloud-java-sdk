// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPageByCondAppInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetPageByCondAppInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPageByCondAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPageByCondAppInfoResponseBody self = new GetPageByCondAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPageByCondAppInfoResponseBody setData(GetPageByCondAppInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPageByCondAppInfoResponseBodyData getData() {
        return this.data;
    }

    public GetPageByCondAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPageByCondAppInfoResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<AppInfoDTO> list;

        @NameInMap("Total")
        public Long total;

        public static GetPageByCondAppInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPageByCondAppInfoResponseBodyData self = new GetPageByCondAppInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPageByCondAppInfoResponseBodyData setList(java.util.List<AppInfoDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<AppInfoDTO> getList() {
            return this.list;
        }

        public GetPageByCondAppInfoResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
