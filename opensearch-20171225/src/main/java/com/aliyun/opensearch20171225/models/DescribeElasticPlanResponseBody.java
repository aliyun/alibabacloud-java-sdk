// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ElasticPlan.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Long httpCode;

    /**
     * <strong>example:</strong>
     * <p>Elastic plan not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeElasticPlanResponseBodyResult result;

    public static DescribeElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanResponseBody self = new DescribeElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeElasticPlanResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public DescribeElasticPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticPlanResponseBody setResult(DescribeElasticPlanResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeElasticPlanResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeElasticPlanResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>120123456</p>
         */
        @NameInMap("appGroupId")
        public Long appGroupId;

        /**
         * <strong>example:</strong>
         * <p>1590139542</p>
         */
        @NameInMap("created")
        public Long created;

        @NameInMap("customDates")
        public java.util.List<String> customDates;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("elasticLcu")
        public Integer elasticLcu;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("endHour")
        public Integer endHour;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>plan name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>WEEK</p>
         */
        @NameInMap("scheduleType")
        public String scheduleType;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("startHour")
        public Integer startHour;

        /**
         * <strong>example:</strong>
         * <p>1581065904</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static DescribeElasticPlanResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticPlanResponseBodyResult self = new DescribeElasticPlanResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeElasticPlanResponseBodyResult setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public DescribeElasticPlanResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public DescribeElasticPlanResponseBodyResult setCustomDates(java.util.List<String> customDates) {
            this.customDates = customDates;
            return this;
        }
        public java.util.List<String> getCustomDates() {
            return this.customDates;
        }

        public DescribeElasticPlanResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeElasticPlanResponseBodyResult setElasticLcu(Integer elasticLcu) {
            this.elasticLcu = elasticLcu;
            return this;
        }
        public Integer getElasticLcu() {
            return this.elasticLcu;
        }

        public DescribeElasticPlanResponseBodyResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeElasticPlanResponseBodyResult setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public DescribeElasticPlanResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeElasticPlanResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeElasticPlanResponseBodyResult setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public DescribeElasticPlanResponseBodyResult setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

        public DescribeElasticPlanResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
