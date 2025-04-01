// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetWebshellTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the container.</p>
     * <p>Note:</p>
     * <ul>
     * <li><p>If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
     * </li>
     * <li><p>If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
     * <ul>
     * <li>For information about how to query the version of Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
     * <li>For information about how to upgrade Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
     * </ul>
     * </li>
     * <li><p>If this parameter is specified, the <code>Username</code> parameter that is specified in a request to call this operation and the <code>WorkingDir</code> parameter that is specified in a request to call the <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> operation do not take effect. You can run the command only in the default working directory of the container by using the default user of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * <li><p>If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to <code>#!/usr/bin/python</code> at the beginning of a script to specify a script interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ad-helper</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello-podsdfsdfsdfsdf</p>
     */
    @NameInMap("PodName")
    public String podName;

    public static GetWebshellTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebshellTokenRequest self = new GetWebshellTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetWebshellTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetWebshellTokenRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public GetWebshellTokenRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

}
