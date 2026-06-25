// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceSlsConfigsRequest extends TeaModel {
    /**
     * <p>The short ID of the namespace. You do not need to include the region. This parameter is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The configuration for collecting logs to SLS.</p>
     * <ul>
     * <li><p>To use an SLS resource that is automatically created by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</p>
     * </li>
     * <li><p>To use a custom SLS resource: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</p>
     * </li>
     * </ul>
     * <p>The parameters are described as follows:</p>
     * <ul>
     * <li><p><code>projectName</code>: The name of the SLS project.</p>
     * </li>
     * <li><p><code>logDir</code>: The log path.</p>
     * </li>
     * <li><p><code>logType</code>: The log type. A value of <code>stdout</code> specifies container standard output logs. You can specify only one <code>stdout</code> configuration. If you do not set this parameter, file logs are collected.</p>
     * </li>
     * <li><p><code>logstoreName</code>: The name of the SLS logstore.</p>
     * </li>
     * <li><p><code>logtailName</code>: The name of the Logtail. If you do not specify this parameter, a new Logtail is created.</p>
     * </li>
     * </ul>
     * <p>If the SLS configuration remains the same across deployments, you can omit this parameter. To disable log collection to SLS, set the value of <code>SlsConfigs</code> to an empty string (&quot;&quot;).</p>
     * <blockquote>
     * <p>SAE automatically deletes a project when you delete the task template used to create it. Therefore, when you select an existing project, do not select a project that was automatically created by SAE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>The SLS log tags.</p>
     */
    @NameInMap("SlsLogEnvTags")
    public String slsLogEnvTags;

    public static UpdateNamespaceSlsConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceSlsConfigsRequest self = new UpdateNamespaceSlsConfigsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceSlsConfigsRequest setNameSpaceShortId(String nameSpaceShortId) {
        this.nameSpaceShortId = nameSpaceShortId;
        return this;
    }
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
    }

    public UpdateNamespaceSlsConfigsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNamespaceSlsConfigsRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public UpdateNamespaceSlsConfigsRequest setSlsLogEnvTags(String slsLogEnvTags) {
        this.slsLogEnvTags = slsLogEnvTags;
        return this;
    }
    public String getSlsLogEnvTags() {
        return this.slsLogEnvTags;
    }

}
