// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateCapabilityRequest extends TeaModel {
    /**
     * <p>The configuration description.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("itemDesc")
    public String itemDesc;

    /**
     * <p>The configuration name.</p>
     * 
     * <strong>example:</strong>
     * <p>es_knowledge_base</p>
     */
    @NameInMap("itemName")
    public String itemName;

    /**
     * <p>The configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;name&quot;: &quot;知识库名称&quot;,
     *         &quot;type&quot;: &quot;aliyun-es&quot;,
     *         &quot;endpoint&quot;: {
     *             &quot;address&quot;: &quot;<a href="http://xxxxx.es-serverless.aliyuncs.com:9200">http://xxxxx.es-serverless.aliyuncs.com:9200</a>&quot;,
     *             &quot;authorization&quot;: &quot;xxx:ABCDxxxx&quot;,
     *             &quot;network&quot;: {
     *                 &quot;type&quot;: &quot;public&quot;
     *             },
     *             &quot;region&quot;: &quot;&quot;
     *         },
     *         &quot;function&quot;: {
     *             &quot;indexName&quot;: &quot;product_info&quot;,
     *             &quot;queryType&quot;: &quot;hybrid-search&quot;,
     *             &quot;description&quot;: &quot;金融理财产品知识库，理财产品名称列表及详细描述&quot;,
     *             &quot;parameters&quot;: {
     *                 &quot;properties&quot;: {
     *                     &quot;query&quot;: {
     *                         &quot;defaultValue&quot;: &quot;&quot;,
     *                         &quot;description&quot;: &quot;理财产品名称或详细描述&quot;,
     *                         &quot;type&quot;: &quot;string&quot;
     *                     }
     *                 },
     *                 &quot;required&quot;: [
     *                     &quot;query&quot;
     *                 ]
     *             },
     *             &quot;template&quot;: &quot;{\&quot;query\&quot;:{\&quot;multi_match\&quot;:{\&quot;query\&quot;:\&quot;${parameters.query}\&quot;,\&quot;fields\&quot;: [\&quot;*\&quot;]}}}&quot;,
     *             &quot;type&quot;: &quot;dsl&quot;,
     *             &quot;embedding&quot;: {
     *                 &quot;denseModel&quot;: &quot;dense&quot;,
     *                 &quot;sparseModel&quot;: &quot;sparse&quot;,
     *                 &quot;address&quot;: &quot;address&quot;,
     *                 &quot;authorization&quot;: &quot;authorization&quot;
     *             },
     *             &quot;filter&quot;: &quot;es或os语句&quot;,
     *             &quot;size&quot;: 10
     *         }
     *     }</p>
     */
    @NameInMap("itemValue")
    public java.util.Map<String, ?> itemValue;

    /**
     * <p>Specifies whether to check the validity of the request parameters without performing the actual operation. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateCapabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCapabilityRequest self = new CreateCapabilityRequest();
        return TeaModel.build(map, self);
    }

    public CreateCapabilityRequest setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
        return this;
    }
    public String getItemDesc() {
        return this.itemDesc;
    }

    public CreateCapabilityRequest setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public CreateCapabilityRequest setItemValue(java.util.Map<String, ?> itemValue) {
        this.itemValue = itemValue;
        return this;
    }
    public java.util.Map<String, ?> getItemValue() {
        return this.itemValue;
    }

    public CreateCapabilityRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
