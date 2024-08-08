// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class CalculateMemberLevelRequest extends TeaModel {
    @NameInMap("Body")
    public CalculateMemberLevelRequestBody body;

    public static CalculateMemberLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        CalculateMemberLevelRequest self = new CalculateMemberLevelRequest();
        return TeaModel.build(map, self);
    }

    public CalculateMemberLevelRequest setBody(CalculateMemberLevelRequestBody body) {
        this.body = body;
        return this;
    }
    public CalculateMemberLevelRequestBody getBody() {
        return this.body;
    }

    public static class CalculateMemberLevelRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentGrade")
        public Integer currentGrade;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("CurrentGradeName")
        public String currentGradeName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4000006009418358</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1230094</p>
         */
        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TAOBAO</p>
         */
        @NameInMap("PlatformType")
        public String platformType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0235b7f20a11de9e2bf4c3494b6d998d</p>
         */
        @NameInMap("SerialNo")
        public String serialNo;

        public static CalculateMemberLevelRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CalculateMemberLevelRequestBody self = new CalculateMemberLevelRequestBody();
            return TeaModel.build(map, self);
        }

        public CalculateMemberLevelRequestBody setCurrentGrade(Integer currentGrade) {
            this.currentGrade = currentGrade;
            return this;
        }
        public Integer getCurrentGrade() {
            return this.currentGrade;
        }

        public CalculateMemberLevelRequestBody setCurrentGradeName(String currentGradeName) {
            this.currentGradeName = currentGradeName;
            return this;
        }
        public String getCurrentGradeName() {
            return this.currentGradeName;
        }

        public CalculateMemberLevelRequestBody setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public CalculateMemberLevelRequestBody setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public CalculateMemberLevelRequestBody setPlatformType(String platformType) {
            this.platformType = platformType;
            return this;
        }
        public String getPlatformType() {
            return this.platformType;
        }

        public CalculateMemberLevelRequestBody setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public CalculateMemberLevelRequestBody setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

    }

}
