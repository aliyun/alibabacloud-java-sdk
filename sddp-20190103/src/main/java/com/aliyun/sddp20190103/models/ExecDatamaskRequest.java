// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ExecDatamaskRequest extends TeaModel {
    /**
     * <p>The sensitive data to be de-identified. The value is a JSON string that contains the following parameters:</p>
     * <ul>
     * <li><strong>dataHeaderList</strong>: the names of the columns in which data needs to be de-identified. Specify the column names in accordance with the order of data that needs to be de-identified.</li>
     * <li><strong>dataList</strong>: the data that needs to be de-identified.</li>
     * <li><strong>ruleList</strong>: the IDs of sensitive data detection rules used to detect data that needs to be de-identified. Specify the rule IDs in accordance with the order of data that needs to be de-identified. Each ID identifies a sensitive data detection rule that is used to detect a type of sensitive data. You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to query the IDs of sensitive data detection rules.</li>
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
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the de-identification template. The ID is generated after you create the de-identification template in the <a href="https://yundun.console.aliyun.com/?%5C&p=sddpnext#/sddp/dm/template">Data Security Center (DSC) console</a>. You can choose <strong>Data desensitization</strong> &gt; <strong>Desensitization Template</strong> in the left-side navigation pane and obtain the ID of the de-identification template from the <strong>Desensitization Template</strong> page.</p>
     * <ul>
     * <li>If you select <strong>Field name</strong> as the matching mode of the template, DSC matches data based on the columns specified by the <strong>dataHeaderList</strong> parameter in the <strong>Data</strong> parameter.</li>
     * <li>If you select <strong>Sensitive type</strong> as the matching mode of the template, DSC matches data based on the sensitive data detection rules specified by the <strong>ruleList</strong> parameter in the <strong>Data</strong> parameter.</li>
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
