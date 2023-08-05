// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetCleanConfigResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<ListAssetCleanConfigResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAssetCleanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssetCleanConfigResponseBody self = new ListAssetCleanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssetCleanConfigResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListAssetCleanConfigResponseBody setData(java.util.List<ListAssetCleanConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAssetCleanConfigResponseBodyData> getData() {
        return this.data;
    }

    public ListAssetCleanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAssetCleanConfigResponseBodyData extends TeaModel {
        @NameInMap("CleanDays")
        public Integer cleanDays;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        public static ListAssetCleanConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAssetCleanConfigResponseBodyData self = new ListAssetCleanConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAssetCleanConfigResponseBodyData setCleanDays(Integer cleanDays) {
            this.cleanDays = cleanDays;
            return this;
        }
        public Integer getCleanDays() {
            return this.cleanDays;
        }

        public ListAssetCleanConfigResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAssetCleanConfigResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
