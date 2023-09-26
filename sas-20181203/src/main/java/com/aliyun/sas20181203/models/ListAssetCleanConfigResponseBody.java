// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetCleanConfigResponseBody extends TeaModel {
    /**
     * <p>The number of cleanup configurations.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The asset cleanup configurations.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAssetCleanConfigResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The number of days before hosts whose provider cannot be identified are automatically cleaned after they enter the offline state. Valid value: an integer that ranges from 1 to 30.</p>
         */
        @NameInMap("CleanDays")
        public Integer cleanDays;

        /**
         * <p>Indicates whether the configuration takes effect. Valid values:</p>
         * <br>
         * <p>*   **0**: The configuration does not take effect.</p>
         * <p>*   **1**: The configuration takes effect.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of hosts that are cleaned.</p>
         * <br>
         * <p>*   The value is set to **1**, which indicates hosts whose provider cannot be identified.</p>
         */
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
