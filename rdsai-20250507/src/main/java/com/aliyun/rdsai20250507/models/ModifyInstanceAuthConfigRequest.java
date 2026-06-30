// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceAuthConfigRequest extends TeaModel {
    /**
     * <p>The ID of the RDS Supabase instance.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<ModifyInstanceAuthConfigRequestConfigList> configList;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceAuthConfig</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyInstanceAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAuthConfigRequest self = new ModifyInstanceAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAuthConfigRequest setConfigList(java.util.List<ModifyInstanceAuthConfigRequestConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<ModifyInstanceAuthConfigRequestConfigList> getConfigList() {
        return this.configList;
    }

    public ModifyInstanceAuthConfigRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceAuthConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyInstanceAuthConfigRequestConfigList extends TeaModel {
        /**
         * <p>The name of the configuration item. Valid values:</p>
         * <ul>
         * <li><strong>GOTRUE_EXTERNAL_EMAIL_ENABLED</strong>: Enables external email addresses.</li>
         * <li><strong>GOTRUE_SITE_URL</strong>: The website URL displayed in emails sent by the AI application.</li>
         * <li><strong>GOTRUE_SMTP_PORT</strong>: The port of the SMTP service provider.</li>
         * <li><strong>GOTRUE_SMTP_SENDER_NAME</strong>: The name of the email sender.</li>
         * <li><strong>GOTRUE_SMTP_USER</strong>: The username of the SMTP service provider.</li>
         * <li><strong>GOTRUE_SMTP_PASS</strong>: The key of the SMTP service provider.</li>
         * <li><strong>GOTRUE_SMTP_ADMIN_EMAIL</strong>: The email address of the SMTP service provider.</li>
         * <li><strong>GOTRUE_SMTP_HOST</strong>: The host address of the SMTP service provider.</li>
         * <li><strong>GOTRUE_MAILER_AUTOCONFIRM</strong>: Specifies whether automatic confirmation is enabled.</li>
         * <li><strong>GOTRUE_MAILER_OTP_EXP</strong>: The validity period of the one-time password (OTP), in seconds.</li>
         * <li><strong>GOTRUE_MAILER_OTP_LENGTH</strong>: The length of the verification code for the one-time password (OTP). The value must be an integer greater than or equal to 6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GOTRUE_SITE_URL</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://8.152">http://8.152</a>. XXX.XXX</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyInstanceAuthConfigRequestConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAuthConfigRequestConfigList self = new ModifyInstanceAuthConfigRequestConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAuthConfigRequestConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyInstanceAuthConfigRequestConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
