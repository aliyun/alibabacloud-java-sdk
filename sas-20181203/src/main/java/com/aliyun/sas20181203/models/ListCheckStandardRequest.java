// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckStandardRequest extends TeaModel {
    /**
     * <p>The instance IDs of the cloud services to which the check items belong.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The subtypes of cloud services.</p>
     */
    @NameInMap("InstanceSubTypes")
    public java.util.List<String> instanceSubTypes;

    /**
     * <p>The asset types of cloud services.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cloud service providers. Valid values:</p>
     * <ul>
     * <li><strong>ALIYUN</strong>: Alibaba Cloud.</li>
     * <li><strong>TENCENT</strong>: Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud.</li>
     * <li><strong>MICROSOFT</strong>: Microsoft Azure.</li>
     * <li><strong>AWS</strong>: Amazon Web Services (AWS).</li>
     * </ul>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static ListCheckStandardRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckStandardRequest self = new ListCheckStandardRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckStandardRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListCheckStandardRequest setInstanceSubTypes(java.util.List<String> instanceSubTypes) {
        this.instanceSubTypes = instanceSubTypes;
        return this;
    }
    public java.util.List<String> getInstanceSubTypes() {
        return this.instanceSubTypes;
    }

    public ListCheckStandardRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ListCheckStandardRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckStandardRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
