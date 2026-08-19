// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateTranscodeTemplateGroupRequest extends TeaModel {
    /**
     * <p>The lock state of the template group. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: locked. A locked template group cannot be modified.</li>
     * <li><strong>Disabled</strong> (default): unlocked.</li>
     * </ul>
     * <p>Default value: <strong>Disabled</strong>. If you specify this parameter, the lock state of the template group is changed, while the name and configurations of the transcoding template group remain unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("Locked")
    public String locked;

    /**
     * <p>The name of the transcoding template group.</p>
     * <ul>
     * <li>The name can be up to 128 bytes in length.</li>
     * <li>The name is encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>transcodetemplate</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the transcoding template group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4c71a339fe*****52b4fa6f4527</p>
     */
    @NameInMap("TranscodeTemplateGroupId")
    public String transcodeTemplateGroupId;

    /**
     * <p>The transcoding template configurations (a JSON string). For more information about the parameter structure, see <a href="~~52839#title-9mb-8o2-uu6~~">TranscodeTemplate</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Video&quot;:{&quot;Bitrate&quot;:&quot;400&quot;,&quot;Codec&quot;:&quot;H.264&quot;,&quot;Fps&quot;:&quot;30&quot;},&quot;Audio&quot;:{&quot;Codec&quot;:&quot;AAC&quot;,&quot;Bitrate&quot;:&quot;64&quot;,&quot;Definition&quot;:&quot;SD&quot;,&quot;EncryptType&quot;:&quot;Private&quot;,&quot;Container&quot;:{&quot;Format&quot;:&quot;m3u8&quot;},&quot;PackageType&quot;:&quot;HLSPackage&quot;}}]</p>
     */
    @NameInMap("TranscodeTemplateList")
    public String transcodeTemplateList;

    public static UpdateTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscodeTemplateGroupRequest self = new UpdateTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTranscodeTemplateGroupRequest setLocked(String locked) {
        this.locked = locked;
        return this;
    }
    public String getLocked() {
        return this.locked;
    }

    public UpdateTranscodeTemplateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTranscodeTemplateGroupRequest setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    public UpdateTranscodeTemplateGroupRequest setTranscodeTemplateList(String transcodeTemplateList) {
        this.transcodeTemplateList = transcodeTemplateList;
        return this;
    }
    public String getTranscodeTemplateList() {
        return this.transcodeTemplateList;
    }

}
