// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockDeleteConfigRequest extends TeaModel {
    /**
     * <p>The ID of the protected directory that you want to delete.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeWebLockConfigList~~">DescribeWebLockConfigList</a> operation to query the IDs of protected directories.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Id")
    public Integer id;

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
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server for which you want to delete the protected directory.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeWebLockConfigList~~">DescribeWebLockConfigList</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7f7fe9a2-55de-4b9d-a37a-0d981d36****</p>
     */
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
