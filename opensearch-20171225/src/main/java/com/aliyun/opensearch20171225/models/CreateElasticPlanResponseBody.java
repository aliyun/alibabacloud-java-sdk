// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateElasticPlanResponseBody extends TeaModel {
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
     * <p>0FFF39C5-ED93-5234-806D-0824B967E6A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateElasticPlanResponseBodyResult result;

    public static CreateElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticPlanResponseBody self = new CreateElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateElasticPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateElasticPlanResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public CreateElasticPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateElasticPlanResponseBody setResult(CreateElasticPlanResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateElasticPlanResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateElasticPlanResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100298370</p>
         */
        @NameInMap("appGroupId")
        public String appGroupId;

        /**
         * <strong>example:</strong>
         * <p>1588836130</p>
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
         * <p>True</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("endHour")
        public Integer endHour;

        /**
         * <strong>example:</strong>
         * <p>89047</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>name</p>
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
         * <p>1588839490</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static CreateElasticPlanResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateElasticPlanResponseBodyResult self = new CreateElasticPlanResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateElasticPlanResponseBodyResult setAppGroupId(String appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public String getAppGroupId() {
            return this.appGroupId;
        }

        public CreateElasticPlanResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public CreateElasticPlanResponseBodyResult setCustomDates(java.util.List<String> customDates) {
            this.customDates = customDates;
            return this;
        }
        public java.util.List<String> getCustomDates() {
            return this.customDates;
        }

        public CreateElasticPlanResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateElasticPlanResponseBodyResult setElasticLcu(Integer elasticLcu) {
            this.elasticLcu = elasticLcu;
            return this;
        }
        public Integer getElasticLcu() {
            return this.elasticLcu;
        }

        public CreateElasticPlanResponseBodyResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateElasticPlanResponseBodyResult setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public CreateElasticPlanResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateElasticPlanResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateElasticPlanResponseBodyResult setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public CreateElasticPlanResponseBodyResult setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

        public CreateElasticPlanResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
