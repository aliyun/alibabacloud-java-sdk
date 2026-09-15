// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventLevelCountRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c7e3c5b420a7947c2933303144688****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The container search field. Valid values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: instance ID</li>
     * <li><strong>appName</strong>: application name</li>
     * <li><strong>clusterId</strong>: cluster ID</li>
     * <li><strong>regionId</strong>: region</li>
     * <li><strong>nodeName</strong>: node name</li>
     * <li><strong>namespace</strong>: namespace</li>
     * <li><strong>clusterName</strong>: cluster name</li>
     * <li><strong>image</strong>: image name</li>
     * <li><strong>imageRepoName</strong>: image repository name</li>
     * <li><strong>imageRepoNamespace</strong>: image repository namespace</li>
     * <li><strong>imageRepoTag</strong>: image tag</li>
     * <li><strong>imageDigest</strong>: image digest</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clusterId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the field that you want to query. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>c951761046a9c4afe92be0a7b5bexxxxx</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The container IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx30389a10c28f6d38f2398f0dcexxxxxxx922b9e8290dc7c3019d4a8,48b87f2c0662e334820f436cb9133f1ae4e053d39b6fad42xxxxxxxxxx</p>
     */
    @NameInMap("ContainerIds")
    public String containerIds;

    /**
     * <p>The source identifier of the request. Set this parameter to <strong>sas</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The multi-account query type. Default value: <strong>0</strong>. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Query data of the current account.</li>
     * <li><strong>1</strong>: Query data of all accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MultiAccountActionType")
    public Integer multiAccountActionType;

    /**
     * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The query type. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong>: container ID</li>
     * <li><strong>uuid</strong>: asset ID</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static DescribeEventLevelCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLevelCountRequest self = new DescribeEventLevelCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventLevelCountRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeEventLevelCountRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeEventLevelCountRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeEventLevelCountRequest setContainerIds(String containerIds) {
        this.containerIds = containerIds;
        return this;
    }
    public String getContainerIds() {
        return this.containerIds;
    }

    public DescribeEventLevelCountRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeEventLevelCountRequest setMultiAccountActionType(Integer multiAccountActionType) {
        this.multiAccountActionType = multiAccountActionType;
        return this;
    }
    public Integer getMultiAccountActionType() {
        return this.multiAccountActionType;
    }

    public DescribeEventLevelCountRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeEventLevelCountRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
