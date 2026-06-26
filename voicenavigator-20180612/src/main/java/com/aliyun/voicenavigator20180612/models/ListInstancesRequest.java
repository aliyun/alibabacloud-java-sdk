// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>A JSON-formatted string that contains a list of digital worker instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;e4bebxxxxxxxxxxx&quot;]</p>
     */
    @NameInMap("InstanceIdListJsonString")
    public String instanceIdListJsonString;

    /**
     * <p>The instance name. This parameter is used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The NLU service type. This parameter is used to filter instances by the source of their conversational AI capabilities. If you do not set this parameter, instances of all types are returned.</p>
     * <ul>
     * <li><p><code>MANAGED</code>: managed. This value is deprecated.</p>
     * </li>
     * <li><p><code>AUTHORIZED</code>: authorized. In the public cloud, this indicates the Chatbot service.</p>
     * </li>
     * <li><p><code>PROVIDED</code>: private. This service is configured in the console with parameters such as <code>as</code>, <code>sk</code>, and <code>chatEndpoint</code>.</p>
     * </li>
     * <li><p><code>CCC_AUTHORIZED</code>: a chatbot authorized by Cloud Connect Center (CCC).</p>
     * </li>
     * <li><p><code>CCC_FUNCTION</code>: Alibaba Cloud Function Compute.</p>
     * </li>
     * <li><p><code>SSE_FUNCTION</code>: a streaming function service. This refers to a Function Compute instance that supports Server-Sent Events (SSE) for integration with third-party large language model (LLM) chatbots.</p>
     * </li>
     * <li><p><code>PROMPTS</code>: integration with foundational models such as Qwen.</p>
     * </li>
     * <li><p><code>LOCAL</code>: a private cloud instance of Chatbot.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;CCC_AUTHORIZED&quot;]</p>
     */
    @NameInMap("NluServiceTypeListJsonString")
    public String nluServiceTypeListJsonString;

    /**
     * <p>The inbound number. This parameter is used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>021xxxxxxx</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The instance status. This parameter is used for filtering. If you do not set this parameter, instances in all statuses are returned.</p>
     * <ul>
     * <li><p><code>DISABLED</code>: disabled</p>
     * </li>
     * <li><p><code>PUBLISHED</code>: published</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLISHED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>If you set <code>UnionSource</code> to <code>CCC</code>, set this parameter to the ID of your CCC instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zhyl</p>
     */
    @NameInMap("UnionInstanceId")
    public String unionInstanceId;

    /**
     * <p>The source.</p>
     * <ul>
     * <li><code>CCC</code>: Cloud Connect Center</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CCC</p>
     */
    @NameInMap("UnionSource")
    public String unionSource;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setInstanceIdListJsonString(String instanceIdListJsonString) {
        this.instanceIdListJsonString = instanceIdListJsonString;
        return this;
    }
    public String getInstanceIdListJsonString() {
        return this.instanceIdListJsonString;
    }

    public ListInstancesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListInstancesRequest setNluServiceTypeListJsonString(String nluServiceTypeListJsonString) {
        this.nluServiceTypeListJsonString = nluServiceTypeListJsonString;
        return this;
    }
    public String getNluServiceTypeListJsonString() {
        return this.nluServiceTypeListJsonString;
    }

    public ListInstancesRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ListInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListInstancesRequest setUnionInstanceId(String unionInstanceId) {
        this.unionInstanceId = unionInstanceId;
        return this;
    }
    public String getUnionInstanceId() {
        return this.unionInstanceId;
    }

    public ListInstancesRequest setUnionSource(String unionSource) {
        this.unionSource = unionSource;
        return this;
    }
    public String getUnionSource() {
        return this.unionSource;
    }

}
