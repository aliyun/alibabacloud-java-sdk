// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListCallCenterProvidersResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The call center provider data.</p>
     */
    @NameInMap("Data")
    public ListCallCenterProvidersResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A list of dynamic error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75BAAB9B-40B2-5FF5-A59A-7BCF8154C6EE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCallCenterProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallCenterProvidersResponseBody self = new ListCallCenterProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallCenterProvidersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallCenterProvidersResponseBody setData(ListCallCenterProvidersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCallCenterProvidersResponseBodyData getData() {
        return this.data;
    }

    public ListCallCenterProvidersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallCenterProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallCenterProvidersResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCallCenterProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCallCenterProvidersResponseBodyDataProviders extends TeaModel {
        /**
         * <p>The destination of the call transfer. Required if the transfer mode is <code>Bridge</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>153*********</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The display name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>云联络中心内部服务提供商</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The extra data.&gt;Notice:  Format: <code>k1=v1;k2=v2</code></p>
         * 
         * <strong>example:</strong>
         * <p>key1=value1</p>
         */
        @NameInMap("Extras")
        public String extras;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The service provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>云联络中心内部服务提供商</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The originator of the call transfer. Required if the transfer mode is <code>Bridge</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>010****</p>
         */
        @NameInMap("Originator")
        public String originator;

        /**
         * <p>The call center provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxx</p>
         */
        @NameInMap("ProviderId")
        public String providerId;

        /**
         * <p>The provider type.</p>
         * <blockquote>
         * <ul>
         * <li><p><code>CCC</code>: Cloud Contact Center</p>
         * </li>
         * <li><p><code>CUSTOM</code>: customer-owned contact center</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CCC</p>
         */
        @NameInMap("ProviderType")
        public String providerType;

        /**
         * <p>The Refer address.&gt;Notice:  Required if the transfer mode is <code>Refer</code>.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ReferTo")
        public String referTo;

        /**
         * <p>The trunk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>trunk-xxx</p>
         */
        @NameInMap("TrunkId")
        public String trunkId;

        public static ListCallCenterProvidersResponseBodyDataProviders build(java.util.Map<String, ?> map) throws Exception {
            ListCallCenterProvidersResponseBodyDataProviders self = new ListCallCenterProvidersResponseBodyDataProviders();
            return TeaModel.build(map, self);
        }

        public ListCallCenterProvidersResponseBodyDataProviders setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ListCallCenterProvidersResponseBodyDataProviders setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListCallCenterProvidersResponseBodyDataProviders setExtras(String extras) {
            this.extras = extras;
            return this;
        }
        public String getExtras() {
            return this.extras;
        }

        public ListCallCenterProvidersResponseBodyDataProviders setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCallCenterProvidersResponseBodyDataProviders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCallCenterProvidersResponseBodyDataProviders setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public ListCallCenterProvidersResponseBodyDataProviders setProviderId(String providerId) {
            this.providerId = providerId;
            return this;
        }
        public String getProviderId() {
            return this.providerId;
        }

        public ListCallCenterProvidersResponseBodyDataProviders setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public ListCallCenterProvidersResponseBodyDataProviders setReferTo(String referTo) {
            this.referTo = referTo;
            return this;
        }
        public String getReferTo() {
            return this.referTo;
        }

        public ListCallCenterProvidersResponseBodyDataProviders setTrunkId(String trunkId) {
            this.trunkId = trunkId;
            return this;
        }
        public String getTrunkId() {
            return this.trunkId;
        }

    }

    public static class ListCallCenterProvidersResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>A list of call center providers.</p>
         */
        @NameInMap("Providers")
        public java.util.List<ListCallCenterProvidersResponseBodyDataProviders> providers;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCallCenterProvidersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallCenterProvidersResponseBodyData self = new ListCallCenterProvidersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallCenterProvidersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCallCenterProvidersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCallCenterProvidersResponseBodyData setProviders(java.util.List<ListCallCenterProvidersResponseBodyDataProviders> providers) {
            this.providers = providers;
            return this;
        }
        public java.util.List<ListCallCenterProvidersResponseBodyDataProviders> getProviders() {
            return this.providers;
        }

        public ListCallCenterProvidersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
