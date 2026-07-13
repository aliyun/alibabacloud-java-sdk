// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The list of digital employee scenario IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;e4bebxxxxxxxxxxx&quot;]</p>
     */
    @NameInMap("InstanceIdListJsonString")
    public String instanceIdListJsonString;

    /**
     * <p>The scenario name used as a filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The NLU type used to filter by dialog capability source. If this parameter is not specified, all types are selected.</p>
     * <ul>
     * <li><p>MANAGED: managed (deprecated).</p>
     * </li>
     * <li><p>AUTHORIZED: authorized. In the public cloud, this refers to Chatbot service.</p>
     * </li>
     * <li><p>PROVIDED: private. Configured by specifying the AccessKey ID, AccessKey Secret, and chatEndpoint in the O&amp;M console.</p>
     * </li>
     * <li><p>CCC_AUTHORIZED: uses a Chatbot authorized by Cloud Call Center.</p>
     * </li>
     * <li><p>CCC_FUNCTION: uses Alibaba Cloud Function Compute.</p>
     * </li>
     * <li><p>SSE_FUNCTION: uses a streaming function service. Function Compute that supports SSE, used to connect to third-party large language model chatbots.</p>
     * </li>
     * <li><p>PROMPTS: connects to Qwen foundation models.</p>
     * </li>
     * <li><p>LOCAL: private cloud, local Chatbot.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;CCC_AUTHORIZED&quot;]</p>
     */
    @NameInMap("NluServiceTypeListJsonString")
    public String nluServiceTypeListJsonString;

    /**
     * <p>The inbound number used as a filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>021xxxxxxx</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The scenario status used as a filter condition. If this parameter is not specified, all statuses are selected.</p>
     * <ul>
     * <li>DISABLED: offline.</li>
     * <li>PUBLISHED: published.</li>
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
     * <p>When UnionSource is set to CCC, set UnionInstanceId to the instance ID of Cloud Call Center.</p>
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
     * <li>CCC: Cloud Call Center.</li>
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
