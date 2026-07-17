// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyElasticPlanResponseBody extends TeaModel {
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
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ModifyElasticPlanResponseBodyResult result;

    public static ModifyElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticPlanResponseBody self = new ModifyElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElasticPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyElasticPlanResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ModifyElasticPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyElasticPlanResponseBody setResult(ModifyElasticPlanResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyElasticPlanResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyElasticPlanResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>120123456</p>
         */
        @NameInMap("appGroupId")
        public Long appGroupId;

        /**
         * <strong>example:</strong>
         * <p>1588839490</p>
         */
        @NameInMap("created")
        public Long created;

        @NameInMap("customDates")
        public java.util.List<String> customDates;

        /**
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("endHour")
        public Integer endHour;

        /**
         * <strong>example:</strong>
         * <p>286</p>
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
         * <p>6</p>
         */
        @NameInMap("startHour")
        public Integer startHour;

        /**
         * <strong>example:</strong>
         * <p>1539158313</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static ModifyElasticPlanResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyElasticPlanResponseBodyResult self = new ModifyElasticPlanResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyElasticPlanResponseBodyResult setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public ModifyElasticPlanResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ModifyElasticPlanResponseBodyResult setCustomDates(java.util.List<String> customDates) {
            this.customDates = customDates;
            return this;
        }
        public java.util.List<String> getCustomDates() {
            return this.customDates;
        }

        public ModifyElasticPlanResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyElasticPlanResponseBodyResult setElasticLcu(Integer elasticLcu) {
            this.elasticLcu = elasticLcu;
            return this;
        }
        public Integer getElasticLcu() {
            return this.elasticLcu;
        }

        public ModifyElasticPlanResponseBodyResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyElasticPlanResponseBodyResult setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public ModifyElasticPlanResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyElasticPlanResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyElasticPlanResponseBodyResult setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ModifyElasticPlanResponseBodyResult setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

        public ModifyElasticPlanResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
