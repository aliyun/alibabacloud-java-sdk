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

    @NameInMap("total")
    public Integer total;

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

    public ListAbnormalyEventsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAbnormalyEventsResponseBodyDataOptsResult extends TeaModel {
        @NameInMap("status")
        public String status;

        @NameInMap("url")
        public String url;

        public static ListAbnormalyEventsResponseBodyDataOptsResult build(java.util.Map<String, ?> map) throws Exception {
            ListAbnormalyEventsResponseBodyDataOptsResult self = new ListAbnormalyEventsResponseBodyDataOptsResult();
            return TeaModel.build(map, self);
        }

        public ListAbnormalyEventsResponseBodyDataOptsResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAbnormalyEventsResponseBodyDataOptsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListAbnormalyEventsResponseBodyDataOpts extends TeaModel {
        @NameInMap("label")
        public String label;

        @NameInMap("result")
        public ListAbnormalyEventsResponseBodyDataOptsResult result;

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

        public ListAbnormalyEventsResponseBodyDataOpts setResult(ListAbnormalyEventsResponseBodyDataOptsResult result) {
            this.result = result;
            return this;
        }
        public ListAbnormalyEventsResponseBodyDataOptsResult getResult() {
            return this.result;
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
        public Long createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("diag_status")
        public Integer diagStatus;

        @NameInMap("end_at")
        public Long endAt;

        /**
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        @NameInMap("instance")
        public String instance;

        @NameInMap("item")
        public String item;

        @NameInMap("level")
        public String level;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("opts")
        public java.util.List<ListAbnormalyEventsResponseBodyDataOpts> opts;

        @NameInMap("pod")
        public String pod;

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

        @NameInMap("uuid")
        public String uuid;

        public static ListAbnormalyEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAbnormalyEventsResponseBodyData self = new ListAbnormalyEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAbnormalyEventsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListAbnormalyEventsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAbnormalyEventsResponseBodyData setDiagStatus(Integer diagStatus) {
            this.diagStatus = diagStatus;
            return this;
        }
        public Integer getDiagStatus() {
            return this.diagStatus;
        }

        public ListAbnormalyEventsResponseBodyData setEndAt(Long endAt) {
            this.endAt = endAt;
            return this;
        }
        public Long getEndAt() {
            return this.endAt;
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

        public ListAbnormalyEventsResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListAbnormalyEventsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAbnormalyEventsResponseBodyData setOpts(java.util.List<ListAbnormalyEventsResponseBodyDataOpts> opts) {
            this.opts = opts;
            return this;
        }
        public java.util.List<ListAbnormalyEventsResponseBodyDataOpts> getOpts() {
            return this.opts;
        }

        public ListAbnormalyEventsResponseBodyData setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
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

        public ListAbnormalyEventsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
