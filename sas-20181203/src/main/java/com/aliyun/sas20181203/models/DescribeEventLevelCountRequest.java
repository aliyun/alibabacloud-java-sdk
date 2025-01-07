// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventLevelCountRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c7e3c5b420a7947c2933303144688****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The key of the condition that is used to query alert events on containers. Valid values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: the ID of the asset</li>
     * <li><strong>appName</strong>: the name of the application</li>
     * <li><strong>clusterId</strong>: the ID of the cluster</li>
     * <li><strong>regionId</strong>: the ID of the region</li>
     * <li><strong>nodeName</strong>: the name of the node</li>
     * <li><strong>namespace</strong>: the namespace</li>
     * <li><strong>clusterName</strong>: the name of the cluster</li>
     * <li><strong>image</strong>: the name of the image</li>
     * <li><strong>imageRepoName</strong>: the name of the image repository</li>
     * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
     * <li><strong>imageRepoTag</strong>: the tag that is added to the image</li>
     * <li><strong>imageDigest</strong>: the digest of the image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clusterId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the condition that is used to query alert events on containers. If you specify multiple values, separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>c951761046a9c4afe92be0a7b5bexxxxx</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The ID of the container.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx30389a10c28f6d38f2398f0dcexxxxxxx922b9e8290dc7c3019d4a8,48b87f2c0662e334820f436cb9133f1ae4e053d39b6fad42xxxxxxxxxx</p>
     */
    @NameInMap("ContainerIds")
    public String containerIds;

    /**
     * <p>The ID of the request source. Set the value to <strong>sas</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The type of the accounts that you want to query. Default value: <strong>0</strong>. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the current account.</li>
     * <li><strong>1</strong>: all accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MultiAccountActionType")
    public Integer multiAccountActionType;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong>: the ID of the container</li>
     * <li><strong>uuid</strong>: the UUID of the asset</li>
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

    public DescribeEventLevelCountRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
