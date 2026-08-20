// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class GetModelDeploymentResourcesResponseBody extends TeaModel {
    @NameInMap("MemberMatches")
    public java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatches> memberMatches;

    /**
     * <strong>example:</strong>
     * <p>B6B54325-C98C-5937-87A3-2F96C07652EC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetModelDeploymentResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelDeploymentResourcesResponseBody self = new GetModelDeploymentResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelDeploymentResourcesResponseBody setMemberMatches(java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatches> memberMatches) {
        this.memberMatches = memberMatches;
        return this;
    }
    public java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatches> getMemberMatches() {
        return this.memberMatches;
    }

    public GetModelDeploymentResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetModelDeploymentResourcesResponseBodyMemberMatchesDedicatedResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eas-r-lq9p****ao9m2</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static GetModelDeploymentResourcesResponseBodyMemberMatchesDedicatedResources build(java.util.Map<String, ?> map) throws Exception {
            GetModelDeploymentResourcesResponseBodyMemberMatchesDedicatedResources self = new GetModelDeploymentResourcesResponseBodyMemberMatchesDedicatedResources();
            return TeaModel.build(map, self);
        }

        public GetModelDeploymentResourcesResponseBodyMemberMatchesDedicatedResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class GetModelDeploymentResourcesResponseBodyMemberMatchesPublicResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ml.gx9cf.8.62xlarg</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static GetModelDeploymentResourcesResponseBodyMemberMatchesPublicResources build(java.util.Map<String, ?> map) throws Exception {
            GetModelDeploymentResourcesResponseBodyMemberMatchesPublicResources self = new GetModelDeploymentResourcesResponseBodyMemberMatchesPublicResources();
            return TeaModel.build(map, self);
        }

        public GetModelDeploymentResourcesResponseBodyMemberMatchesPublicResources setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class GetModelDeploymentResourcesResponseBodyMemberMatchesQuotas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>quotagn***bb68</p>
         */
        @NameInMap("QuotaId")
        public String quotaId;

        public static GetModelDeploymentResourcesResponseBodyMemberMatchesQuotas build(java.util.Map<String, ?> map) throws Exception {
            GetModelDeploymentResourcesResponseBodyMemberMatchesQuotas self = new GetModelDeploymentResourcesResponseBodyMemberMatchesQuotas();
            return TeaModel.build(map, self);
        }

        public GetModelDeploymentResourcesResponseBodyMemberMatchesQuotas setQuotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }
        public String getQuotaId() {
            return this.quotaId;
        }

    }

    public static class GetModelDeploymentResourcesResponseBodyMemberMatches extends TeaModel {
        @NameInMap("DedicatedResources")
        public java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatchesDedicatedResources> dedicatedResources;

        /**
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        @NameInMap("PublicResources")
        public java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatchesPublicResources> publicResources;

        @NameInMap("Quotas")
        public java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatchesQuotas> quotas;

        public static GetModelDeploymentResourcesResponseBodyMemberMatches build(java.util.Map<String, ?> map) throws Exception {
            GetModelDeploymentResourcesResponseBodyMemberMatches self = new GetModelDeploymentResourcesResponseBodyMemberMatches();
            return TeaModel.build(map, self);
        }

        public GetModelDeploymentResourcesResponseBodyMemberMatches setDedicatedResources(java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatchesDedicatedResources> dedicatedResources) {
            this.dedicatedResources = dedicatedResources;
            return this;
        }
        public java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatchesDedicatedResources> getDedicatedResources() {
            return this.dedicatedResources;
        }

        public GetModelDeploymentResourcesResponseBodyMemberMatches setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public GetModelDeploymentResourcesResponseBodyMemberMatches setPublicResources(java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatchesPublicResources> publicResources) {
            this.publicResources = publicResources;
            return this;
        }
        public java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatchesPublicResources> getPublicResources() {
            return this.publicResources;
        }

        public GetModelDeploymentResourcesResponseBodyMemberMatches setQuotas(java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatchesQuotas> quotas) {
            this.quotas = quotas;
            return this;
        }
        public java.util.List<GetModelDeploymentResourcesResponseBodyMemberMatchesQuotas> getQuotas() {
            return this.quotas;
        }

    }

}
