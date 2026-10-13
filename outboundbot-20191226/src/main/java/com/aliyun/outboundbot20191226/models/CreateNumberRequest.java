// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateNumberRequest extends TeaModel {
    /**
     * <p>The list of phone numbers to create and associate. A maximum of 100 phone numbers can be specified in a single request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Numbers")
    public java.util.List<CreateNumberRequestNumbers> numbers;

    /**
     * <p>The unique identifier of the SIP trunk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6bf8a1d2-3c4e-4f5a-9b8c-7d6e5f4a3b2c</p>
     */
    @NameInMap("TrunkId")
    public String trunkId;

    public static CreateNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNumberRequest self = new CreateNumberRequest();
        return TeaModel.build(map, self);
    }

    public CreateNumberRequest setNumbers(java.util.List<CreateNumberRequestNumbers> numbers) {
        this.numbers = numbers;
        return this;
    }
    public java.util.List<CreateNumberRequestNumbers> getNumbers() {
        return this.numbers;
    }

    public CreateNumberRequest setTrunkId(String trunkId) {
        this.trunkId = trunkId;
        return this;
    }
    public String getTrunkId() {
        return this.trunkId;
    }

    public static class CreateNumberRequestNumbers extends TeaModel {
        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>057188886666</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>The maximum number of requests allowed within the throttling period.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RateLimitCount")
        public Integer rateLimitCount;

        /**
         * <p>The throttling period, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RateLimitPeriod")
        public Integer rateLimitPeriod;

        public static CreateNumberRequestNumbers build(java.util.Map<String, ?> map) throws Exception {
            CreateNumberRequestNumbers self = new CreateNumberRequestNumbers();
            return TeaModel.build(map, self);
        }

        public CreateNumberRequestNumbers setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public CreateNumberRequestNumbers setRateLimitCount(Integer rateLimitCount) {
            this.rateLimitCount = rateLimitCount;
            return this;
        }
        public Integer getRateLimitCount() {
            return this.rateLimitCount;
        }

        public CreateNumberRequestNumbers setRateLimitPeriod(Integer rateLimitPeriod) {
            this.rateLimitPeriod = rateLimitPeriod;
            return this;
        }
        public Integer getRateLimitPeriod() {
            return this.rateLimitPeriod;
        }

    }

}
