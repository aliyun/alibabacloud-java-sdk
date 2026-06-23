// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListImportableKMSSecretsForHostRequest extends TeaModel {
    /**
     * <p>The ID of the host.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to get this ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostId")
    public Integer hostId;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to get this ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the secret to search for. Fuzzy matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results.</p>
     * <blockquote>
     * <p>You do not need to specify this parameter for the first request. For subsequent requests, use the <code>NextToken</code> value from the previous response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>42bc833a0a0002dae0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For details about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and availability zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListImportableKMSSecretsForHostRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImportableKMSSecretsForHostRequest self = new ListImportableKMSSecretsForHostRequest();
        return TeaModel.build(map, self);
    }

    public ListImportableKMSSecretsForHostRequest setHostId(Integer hostId) {
        this.hostId = hostId;
        return this;
    }
    public Integer getHostId() {
        return this.hostId;
    }

    public ListImportableKMSSecretsForHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListImportableKMSSecretsForHostRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListImportableKMSSecretsForHostRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImportableKMSSecretsForHostRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImportableKMSSecretsForHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
