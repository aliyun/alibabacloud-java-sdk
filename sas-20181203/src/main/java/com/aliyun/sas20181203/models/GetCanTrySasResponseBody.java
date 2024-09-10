// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCanTrySasResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetCanTrySasResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8BAA57***B7073A5C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCanTrySasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCanTrySasResponseBody self = new GetCanTrySasResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCanTrySasResponseBody setData(GetCanTrySasResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCanTrySasResponseBodyData getData() {
        return this.data;
    }

    public GetCanTrySasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCanTrySasResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the user is qualified for the trial use. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanTry")
        public Integer canTry;

        /**
         * <p>The editions that are allowed for the trial use.</p>
         */
        @NameInMap("CanTryVersions")
        public java.util.List<Integer> canTryVersions;

        /**
         * <p>The trial type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: trial prohibited</li>
         * <li><strong>1</strong>: first trial</li>
         * <li><strong>2</strong>: second trial</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TryType")
        public Integer tryType;

        public static GetCanTrySasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCanTrySasResponseBodyData self = new GetCanTrySasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCanTrySasResponseBodyData setCanTry(Integer canTry) {
            this.canTry = canTry;
            return this;
        }
        public Integer getCanTry() {
            return this.canTry;
        }

        public GetCanTrySasResponseBodyData setCanTryVersions(java.util.List<Integer> canTryVersions) {
            this.canTryVersions = canTryVersions;
            return this;
        }
        public java.util.List<Integer> getCanTryVersions() {
            return this.canTryVersions;
        }

        public GetCanTrySasResponseBodyData setTryType(Integer tryType) {
            this.tryType = tryType;
            return this;
        }
        public Integer getTryType() {
            return this.tryType;
        }

    }

}
