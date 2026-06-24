// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ExecDatamaskRequest extends TeaModel {
    /**
     * <p>The data that you want to mask. The data must be a string in JSON format and include the following fields:</p>
     * <ul>
     * <li><p><strong>dataHeaderList</strong>: The column names of the data. The order of the column names must correspond to the order of the data that you want to mask.</p>
     * </li>
     * <li><p><strong>dataList</strong>: The data that you want to mask.</p>
     * </li>
     * <li><p><strong>ruleList</strong>: A list of sensitive data type IDs. The order of the IDs must correspond to the order of the data that you want to mask. Each ID is a number that represents a sensitive data type. You can call the <a href="https://help.aliyun.com/document_detail/410141.html">DescribeRules</a> operation to obtain the IDs.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataHeaderList&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;dataList&quot;:[[&quot;lily&quot;,18],[&quot;lucy&quot;,17]],&quot;ruleList&quot;:[1002,null]}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Simplified Chinese</p>
     * </li>
     * <li><p><strong>en_us</strong>: English (US)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the data masking template. A template ID is generated after you create a template in the <a href="https://yundun.console.aliyun.com/?p=sddp#/dm/dmConfig/cn-zhangjiakou">Data Security Center console</a>. You can find the <strong>Template ID</strong> on the <strong>Data Masking</strong> &gt; <strong>Masking Configuration</strong> &gt; <strong>Masking Template</strong> page.</p>
     * <ul>
     * <li><p>If the matching type of the data masking template is <strong>Field Name</strong>, the system matches the data against <strong>dataHeaderList</strong> in <strong>Data</strong>.</p>
     * </li>
     * <li><p>If the matching type of the data masking template is <strong>Sensitive Data Type</strong>, the system matches the data against <strong>ruleList</strong> in <strong>Data</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ExecDatamaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDatamaskRequest self = new ExecDatamaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecDatamaskRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecDatamaskRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public ExecDatamaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecDatamaskRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
