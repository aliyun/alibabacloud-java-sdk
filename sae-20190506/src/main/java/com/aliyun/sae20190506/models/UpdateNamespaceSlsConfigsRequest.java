// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceSlsConfigsRequest extends TeaModel {
    /**
     * <p>The short ID of the namespace. No need to specify a region ID. We recommend configuring this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>The namespace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The logging configurations of Simple Log Service.</p>
     * <ul>
     * <li><code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>: Simple Log Service resources automatically created by Serverless App Engine (SAE) are used.</li>
     * <li>To use custom Simple Log Service resources, set this parameter to <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
     * </ul>
     * <p>Take note of the following subparameters:</p>
     * <ul>
     * <li><strong>projectName</strong>: the name of the Simple Log Service project.</li>
     * <li><strong>logDir</strong>: the path in which logs are stored.</li>
     * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates the standard output (stdout) logs of the container. You can specify only one stdout value for this parameter. If not specified, file logs are collected.</li>
     * <li><strong>logstoreName</strong>: the name of the Logstore in Simple Log Service.</li>
     * <li><strong>logtailName</strong>: the name of the Logtail in Simple Log Service. If not specified, a new Logtail is created.</li>
     * </ul>
     * <p>If logging configuration changes are not needed during job template deployment, specify <strong>SlsConfigs</strong> only in the first request. Omit this parameter in later requests. To stop using Simple Log Service, leave <strong>SlsConfigs</strong> empty.</p>
     * <blockquote>
     * <p>Projects automatically created by SAE for job templates are deleted when their corresponding job templates are deleted. Therefore, you should not select an existing SAE-created project for log collection.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

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
