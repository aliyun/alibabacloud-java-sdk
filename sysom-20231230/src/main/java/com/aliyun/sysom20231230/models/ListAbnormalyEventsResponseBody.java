// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAbnormalyEventsResponseBody extends TeaModel {
    /**
     * <p>Status code.  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization succeeded.  </li>
     * <li>Any other status code indicates authorization failed. When authorization fails, check the <code>message</code> field for detailed error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Return Result.</p>
     */
    @NameInMap("data")
    public java.util.List<ListAbnormalyEventsResponseBodyData> data;

    /**
     * <p>Error code description; empty if no error</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
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
        /**
         * <p>Diagnosis status</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Diagnosis details URL</p>
         * 
         * <strong>example:</strong>
         * <p>/diagnose/result/PhfFg456</p>
         */
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
        /**
         * <p>Operation Type</p>
         * 
         * <strong>example:</strong>
         * <p>diagnose</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>Diagnosis result of the abnormal item</p>
         */
        @NameInMap("result")
        public ListAbnormalyEventsResponseBodyDataOptsResult result;

        /**
         * <p>Diagnosis Type</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
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

    public static class ListAbnormalyEventsResponseBodyDataRawMetrics extends TeaModel {
        /**
         * <p>End Time</p>
         * 
         * <strong>example:</strong>
         * <p>1761814928</p>
         */
        @NameInMap("end_time")
        public Float endTime;

        /**
         * <p>List of metric values.</p>
         */
        @NameInMap("metrics")
        public java.util.List<String> metrics;

        /**
         * <p>Start Time</p>
         * 
         * <strong>example:</strong>
         * <p>1761814928</p>
         */
        @NameInMap("start_time")
        public Float startTime;

        public static ListAbnormalyEventsResponseBodyDataRawMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListAbnormalyEventsResponseBodyDataRawMetrics self = new ListAbnormalyEventsResponseBodyDataRawMetrics();
            return TeaModel.build(map, self);
        }

        public ListAbnormalyEventsResponseBodyDataRawMetrics setEndTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }
        public Float getEndTime() {
            return this.endTime;
        }

        public ListAbnormalyEventsResponseBodyDataRawMetrics setMetrics(java.util.List<String> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<String> getMetrics() {
            return this.metrics;
        }

        public ListAbnormalyEventsResponseBodyDataRawMetrics setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

    }

    public static class ListAbnormalyEventsResponseBodyData extends TeaModel {
        /**
         * <p>Creation Time</p>
         * 
         * <strong>example:</strong>
         * <p>1725801090000</p>
         */
        @NameInMap("created_at")
        public Long createdAt;

        /**
         * <p>Detailed description of the anomalous item.</p>
         * 
         * <strong>example:</strong>
         * <p>节点发生OOM, 可查看OOM发生原因</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Diagnosis status (1 indicates diagnosis ready, 2 indicates running, 3 indicates completed, 4 indicates undiagnosable, 5 indicates failed)</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("diag_status")
        public Integer diagStatus;

        /**
         * <p>End time of the anomalous activity.</p>
         * 
         * <strong>example:</strong>
         * <p>1725797727754</p>
         */
        @NameInMap("end_at")
        public Long endAt;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>Name of the anomalous item.</p>
         * 
         * <strong>example:</strong>
         * <p>节点CPU使用率检测</p>
         */
        @NameInMap("item")
        public String item;

        /**
         * <p>Level of the anomalous item.</p>
         * 
         * <strong>example:</strong>
         * <p>potential</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Namespace where the pod is located</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>List of operations for the abnormal item</p>
         */
        @NameInMap("opts")
        public java.util.List<ListAbnormalyEventsResponseBodyDataOpts> opts;

        /**
         * <p>Pod name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-pod</p>
         */
        @NameInMap("pod")
        public String pod;

        /**
         * <p>Raw metrics</p>
         */
        @NameInMap("raw_metrics")
        public ListAbnormalyEventsResponseBodyDataRawMetrics rawMetrics;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("region_id")
        public String regionId;

        /**
         * <p>Type of abnormal item</p>
         * 
         * <strong>example:</strong>
         * <p>saturation</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>UUID corresponding to the anomalous activity</p>
         * 
         * <strong>example:</strong>
         * <p>43f05b46-1034-42e8-a528-6e5ca1108277</p>
         */
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

        public ListAbnormalyEventsResponseBodyData setRawMetrics(ListAbnormalyEventsResponseBodyDataRawMetrics rawMetrics) {
            this.rawMetrics = rawMetrics;
            return this;
        }
        public ListAbnormalyEventsResponseBodyDataRawMetrics getRawMetrics() {
            return this.rawMetrics;
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
