// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientRuleDashboardResponseBody extends TeaModel {
    /**
     * <p>The data returned when the API call is successful.</p>
     */
    @NameInMap("Data")
    public GetFileProtectClientRuleDashboardResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileProtectClientRuleDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientRuleDashboardResponseBody self = new GetFileProtectClientRuleDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientRuleDashboardResponseBody setData(GetFileProtectClientRuleDashboardResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileProtectClientRuleDashboardResponseBodyData getData() {
        return this.data;
    }

    public GetFileProtectClientRuleDashboardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileProtectClientRuleDashboardResponseBodyData extends TeaModel {
        /**
         * <p>The total number of web tamper-proofing licenses.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AuthTotal")
        public String authTotal;

        /**
         * <p>The number of bound tamper-proofing licenses.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BindCount")
        public Integer bindCount;

        /**
         * <p>The total number of web tamper-proofing rules.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProtectedDirectoriesCount")
        public Integer protectedDirectoriesCount;

        /**
         * <p>The total number of online web tamper-proofing clients.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ProtectedInstancesCount")
        public Integer protectedInstancesCount;

        public static GetFileProtectClientRuleDashboardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileProtectClientRuleDashboardResponseBodyData self = new GetFileProtectClientRuleDashboardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileProtectClientRuleDashboardResponseBodyData setAuthTotal(String authTotal) {
            this.authTotal = authTotal;
            return this;
        }
        public String getAuthTotal() {
            return this.authTotal;
        }

        public GetFileProtectClientRuleDashboardResponseBodyData setBindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }
        public Integer getBindCount() {
            return this.bindCount;
        }

        public GetFileProtectClientRuleDashboardResponseBodyData setProtectedDirectoriesCount(Integer protectedDirectoriesCount) {
            this.protectedDirectoriesCount = protectedDirectoriesCount;
            return this;
        }
        public Integer getProtectedDirectoriesCount() {
            return this.protectedDirectoriesCount;
        }

        public GetFileProtectClientRuleDashboardResponseBodyData setProtectedInstancesCount(Integer protectedInstancesCount) {
            this.protectedInstancesCount = protectedInstancesCount;
            return this;
        }
        public Integer getProtectedInstancesCount() {
            return this.protectedInstancesCount;
        }

    }

}
