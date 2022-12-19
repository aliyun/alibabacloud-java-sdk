// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockDeleteConfigRequest extends TeaModel {
    // The ID of the protected directory that you want to delete. 
    // > You can call the [DescribeWebLockConfigList](~~DescribeWebLockConfigList~~) operation to query the IDs of protected directories.
    @NameInMap("Id")
    public Integer id;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The UUID of the server for which you want to delete the protected directory. 
    // > You can call the [DescribeWebLockConfigList](~~DescribeWebLockConfigList~~) operation to query the UUID of servers.
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyWebLockDeleteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockDeleteConfigRequest self = new ModifyWebLockDeleteConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockDeleteConfigRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public ModifyWebLockDeleteConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyWebLockDeleteConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyWebLockDeleteConfigRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
