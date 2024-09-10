// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackTypeListResponseBody extends TeaModel {
    @NameInMap("AttackTypeList")
    public java.util.List<GetAttackTypeListResponseBodyAttackTypeList> attackTypeList;

    /**
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAttackTypeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAttackTypeListResponseBody self = new GetAttackTypeListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAttackTypeListResponseBody setAttackTypeList(java.util.List<GetAttackTypeListResponseBodyAttackTypeList> attackTypeList) {
        this.attackTypeList = attackTypeList;
        return this;
    }
    public java.util.List<GetAttackTypeListResponseBodyAttackTypeList> getAttackTypeList() {
        return this.attackTypeList;
    }

    public GetAttackTypeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAttackTypeListResponseBodyAttackTypeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sas.attack.type.type12</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>alinet</p>
         */
        @NameInMap("Status_Type")
        public String statusType;

        /**
         * <strong>example:</strong>
         * <p>upload</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAttackTypeListResponseBodyAttackTypeList build(java.util.Map<String, ?> map) throws Exception {
            GetAttackTypeListResponseBodyAttackTypeList self = new GetAttackTypeListResponseBodyAttackTypeList();
            return TeaModel.build(map, self);
        }

        public GetAttackTypeListResponseBodyAttackTypeList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAttackTypeListResponseBodyAttackTypeList setStatusType(String statusType) {
            this.statusType = statusType;
            return this;
        }
        public String getStatusType() {
            return this.statusType;
        }

        public GetAttackTypeListResponseBodyAttackTypeList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
