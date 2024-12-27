// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAbnormalyEventsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListAbnormalyEventsResponseBodyData> data;

    @NameInMap("message")
    public String message;

    public static ListAbnormalyEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAbnormalyEventsResponseBody self = new ListAbnormalyEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAbnormalyEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAbnormalyEventsResponseBody setData(java.util.List<ListAbnormalyEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAbnormalyEventsResponseBodyData> getData() {
        return this.data;
    }

    public ListAbnormalyEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class ListAbnormalyEventsResponseBodyDataOpts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>diagnose</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;service_name\&quot;: \&quot;oomcheck\&quot;, \&quot;params\&quot;: {\&quot;auto_initial\&quot;: true, \&quot;instance\&quot;: \&quot;i-wz9d00ut2ska3mlyhn6i\&quot;, \&quot;region\&quot;: \&quot;cn-shenzhen\&quot;, \&quot;uuid\&quot;: \&quot;24576d0c-a19d-49dd-8a64-3867440fd7a6\&quot;, \&quot;is_history\&quot;: 1}}&quot;</p>
         */
        @NameInMap("params")
        public String params;

        /**
         * <strong>example:</strong>
         * <p>realtime</p>
         */
        @NameInMap("type")
        public String type;

        public static ListAbnormalyEventsResponseBodyDataOpts build(java.util.Map<String, ?> map) throws Exception {
            ListAbnormalyEventsResponseBodyDataOpts self = new ListAbnormalyEventsResponseBodyDataOpts();
            return TeaModel.build(map, self);
        }

        public ListAbnormalyEventsResponseBodyDataOpts setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAbnormalyEventsResponseBodyDataOpts setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public ListAbnormalyEventsResponseBodyDataOpts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAbnormalyEventsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1725801090000</p>
         */
        @NameInMap("created_at")
        public Float createdAt;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        @NameInMap("instance")
        public String instance;

        @NameInMap("item")
        public String item;

        @NameInMap("opts")
        public ListAbnormalyEventsResponseBodyDataOpts opts;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>saturation</p>
         */
        @NameInMap("type")
        public String type;

        public static ListAbnormalyEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAbnormalyEventsResponseBodyData self = new ListAbnormalyEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAbnormalyEventsResponseBodyData setCreatedAt(Float createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Float getCreatedAt() {
            return this.createdAt;
        }

        public ListAbnormalyEventsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAbnormalyEventsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAbnormalyEventsResponseBodyData setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListAbnormalyEventsResponseBodyData setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public ListAbnormalyEventsResponseBodyData setOpts(ListAbnormalyEventsResponseBodyDataOpts opts) {
            this.opts = opts;
            return this;
        }
        public ListAbnormalyEventsResponseBodyDataOpts getOpts() {
            return this.opts;
        }

        public ListAbnormalyEventsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAbnormalyEventsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
