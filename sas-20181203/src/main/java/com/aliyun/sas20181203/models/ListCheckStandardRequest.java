// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckStandardRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("InstanceSubTypes")
    public java.util.List<String> instanceSubTypes;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("Lang")
    public String lang;

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
