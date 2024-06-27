// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateConfigRequest extends TeaModel {
    /**
     * <p>The code of the common configuration item. Valid values:</p>
     * <ul>
     * <li><strong>access_failed_cnt</strong>: the maximum number of access attempts allowed when Data Security Center (DSC) fails to access an unauthorized resource.</li>
     * <li><strong>access_permission_exprie_max_days</strong>: the maximum idle period allowed for access permissions before an alert is triggered.</li>
     * <li><strong>log_datasize_avg_days</strong>: the minimum percentage of the volume of logs of a specific type generated on the current day to the average volume of logs generated in the previous 10 days before an alert is triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>access_failed_cnt</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The description of the common configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>Maximum number of access attempts allowed when DSC fails to access an unauthorized resource: 10</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <li><strong>zh_cn</strong>: Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>39.170.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The value of the common configuration item. The meaning of this parameter varies with the value of the Code parameter.</p>
     * <ul>
     * <li>If you set the Code parameter to <strong>access_failed_cnt</strong>, the Value parameter specifies the maximum number of access attempts allowed when DSC fails to access an unauthorized resource.</li>
     * <li>If you set the Code parameter to <strong>access_permission_exprie_max_days</strong>, the Value parameter specifies the maximum idle period allowed for access permissions before an alert is triggered.</li>
     * <li>If you set the Code parameter to <strong>log_datasize_avg_days</strong>, the Value parameter specifies the minimum percentage of the volume of logs of a specific type generated on the current day to the average amount of logs generated in the previous 10 days before an alert is triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigRequest self = new CreateConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConfigRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public CreateConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
