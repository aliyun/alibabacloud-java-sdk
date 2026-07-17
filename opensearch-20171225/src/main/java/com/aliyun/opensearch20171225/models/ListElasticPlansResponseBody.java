// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListElasticPlansResponseBody extends TeaModel {
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
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>Elastic plan not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListElasticPlansResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListElasticPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListElasticPlansResponseBody self = new ListElasticPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListElasticPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListElasticPlansResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ListElasticPlansResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListElasticPlansResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListElasticPlansResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListElasticPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListElasticPlansResponseBody setResult(java.util.List<ListElasticPlansResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListElasticPlansResponseBodyResult> getResult() {
        return this.result;
    }

    public ListElasticPlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListElasticPlansResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>120123456</p>
         */
        @NameInMap("appGroupId")
        public String appGroupId;

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
         * <p>16</p>
         */
        @NameInMap("endHour")
        public Integer endHour;

        /**
         * <strong>example:</strong>
         * <p>134</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>elastic plan</p>
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
         * <p>11</p>
         */
        @NameInMap("startHour")
        public Integer startHour;

        /**
         * <strong>example:</strong>
         * <p>1588839490</p>
         */
        @NameInMap("updated")
        public Long updated;

        public static ListElasticPlansResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListElasticPlansResponseBodyResult self = new ListElasticPlansResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListElasticPlansResponseBodyResult setAppGroupId(String appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public String getAppGroupId() {
            return this.appGroupId;
        }

        public ListElasticPlansResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListElasticPlansResponseBodyResult setCustomDates(java.util.List<String> customDates) {
            this.customDates = customDates;
            return this;
        }
        public java.util.List<String> getCustomDates() {
            return this.customDates;
        }

        public ListElasticPlansResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListElasticPlansResponseBodyResult setElasticLcu(Integer elasticLcu) {
            this.elasticLcu = elasticLcu;
            return this;
        }
        public Integer getElasticLcu() {
            return this.elasticLcu;
        }

        public ListElasticPlansResponseBodyResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListElasticPlansResponseBodyResult setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public ListElasticPlansResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListElasticPlansResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListElasticPlansResponseBodyResult setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ListElasticPlansResponseBodyResult setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

        public ListElasticPlansResponseBodyResult setUpdated(Long updated) {
            this.updated = updated;
            return this;
        }
        public Long getUpdated() {
            return this.updated;
        }

    }

}
