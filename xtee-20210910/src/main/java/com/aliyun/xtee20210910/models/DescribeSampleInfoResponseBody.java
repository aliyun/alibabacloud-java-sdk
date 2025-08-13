// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleInfoResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DescribeSampleInfoResponseBodyResultObject resultObject;

    public static DescribeSampleInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleInfoResponseBody self = new DescribeSampleInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleInfoResponseBody setResultObject(DescribeSampleInfoResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeSampleInfoResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSampleInfoResponseBodyResultObject extends TeaModel {
        /**
         * <p>Primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>3144</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Sample tags.</p>
         * 
         * <strong>example:</strong>
         * <p>em0102</p>
         */
        @NameInMap("sampleTags")
        public String sampleTags;

        /**
         * <p>Sample type</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE</p>
         */
        @NameInMap("sampleType")
        public String sampleType;

        /**
         * <p>Sample value.</p>
         * 
         * <strong>example:</strong>
         * <p>17700000000</p>
         */
        @NameInMap("sampleValue")
        public String sampleValue;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753804800000</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        public static DescribeSampleInfoResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSampleInfoResponseBodyResultObject self = new DescribeSampleInfoResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSampleInfoResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSampleInfoResponseBodyResultObject setSampleTags(String sampleTags) {
            this.sampleTags = sampleTags;
            return this;
        }
        public String getSampleTags() {
            return this.sampleTags;
        }

        public DescribeSampleInfoResponseBodyResultObject setSampleType(String sampleType) {
            this.sampleType = sampleType;
            return this;
        }
        public String getSampleType() {
            return this.sampleType;
        }

        public DescribeSampleInfoResponseBodyResultObject setSampleValue(String sampleValue) {
            this.sampleValue = sampleValue;
            return this;
        }
        public String getSampleValue() {
            return this.sampleValue;
        }

        public DescribeSampleInfoResponseBodyResultObject setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSampleInfoResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
