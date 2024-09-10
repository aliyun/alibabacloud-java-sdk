// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAssetCleanConfigResponseBody extends TeaModel {
    /**
     * <p>The number of cleanup configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * 
     * <strong>example:</strong>
     * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
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
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CleanDays")
        public Integer cleanDays;

        /**
         * <p>Indicates whether the configuration takes effect. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The configuration does not take effect.</li>
         * <li><strong>1</strong>: The configuration takes effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of hosts that are cleaned.</p>
         * <ul>
         * <li>The value is set to <strong>1</strong>, which indicates hosts whose provider cannot be identified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
