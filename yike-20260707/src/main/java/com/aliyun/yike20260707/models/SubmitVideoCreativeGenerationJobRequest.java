// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoCreativeGenerationJobRequest extends TeaModel {
    /**
     * <p>The aspect ratio. Valid values: 16:9 (default), 9:16, 4:3, and 3:4.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4:3</p>
     */
    @NameInMap("AspectRatio")
    public String aspectRatio;

    /**
     * <p>The digital human information. The value is a JSON string. This parameter is required for the <code>creator-talk</code>, <code>creator-sales</code>, and <code>avatar-broadcast</code> scenes. It includes the following fields:</p>
     * <ul>
     * <li>AvatarPortrait: The digital human portrait. This field is required. The value is a string that represents the media asset ID of the portrait image or the image URL.</li>
     * <li>AvatarVoice: The digital human voice. This field is optional. The value is a string that represents the voice audio ID or the audio URL.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;AvatarPortrait\&quot;:\&quot;xxxxxxx\&quot;,\&quot;AvatarVoice\&quot;:\&quot;<a href="https://ice-ai-saas.oss-cn-shanghai.aliyuncs.com/ice-ai-saas-prd/xxxxxxx%5C%5C%22%7D">https://ice-ai-saas.oss-cn-shanghai.aliyuncs.com/ice-ai-saas-prd/xxxxxxx\\&quot;}</a></p>
     */
    @NameInMap("AvatarData")
    public String avatarData;

    /**
     * <p>The job parameters. The value is a JSON string. This parameter includes the following fields:</p>
     * <ul>
     * <li>TextType: The text type. This field is required. The value is an integer. Valid values: 1 (original draft, such as product or news information, which the system automatically converts into a voiceover script) and 2 (voiceover script).</li>
     * <li>TextContent: The text content. This field is required. The value is a string. The maximum length is 10,000 characters.</li>
     * <li>VoiceDuration: The expected voiceover duration. This field is optional. The value is an integer. This field is configured when TextType is set to 1. Unit: seconds. Default value: 60. The final video duration will be slightly shorter than the expected duration.</li>
     * <li>NarrationVoiceId: The narration voice ID. This field is valid only for the <code>briefing-voiceover</code> scene.</li>
     * <li>SceneImage: The scene image. This field is optional. This field takes effect only for the three creator marketing scenes (creator-sales, creator-talk, and product-showcase). If you specify valid fields for other scenes, an InvalidParameter error is returned. If both fields are empty (including not specified or an empty object {}), it is equivalent to not providing this parameter, and the behavior is consistent with the existing process without rejecting the job. The Prompt and BackgroundMediaId or BackgroundMediaUrl fields are both optional, can coexist, and are not mutually exclusive. If only Prompt is specified, the text mode is used to generate the scene image. If only the background image is specified, the background image mode is used to fuse based on the background image. If both are specified, the background image takes precedence. If both BackgroundMediaId and BackgroundMediaUrl are specified, BackgroundMediaUrl takes precedence. This field includes the following sub-fields:<ul>
     * <li>Prompt: The text description of the scene image. This field is optional. The value is a string. The maximum length is 2,000 characters. If the length exceeds the limit, an InvalidParameter error is returned. An empty string is considered as not provided.</li>
     * <li>BackgroundMediaId: The media asset ID of the background image. This field is optional. The value is a string. During submission, it is parsed into a URL by ice-media. If the parsing fails, the job is immediately rejected.</li>
     * <li>BackgroundMediaUrl: The direct URL of the background image. This field is optional. The value is a string. The URL must use the HTTP or HTTPS protocol. In this case, media asset parsing is not performed.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TextType&quot;:2,&quot;TextContent&quot;:&quot;Today, Beijing held a press conference to announce plans to further optimize the city\&quot;s transportation network, including adding three new subway lines within the next three years....&quot;,&quot;SceneImage&quot;:{&quot;Prompt&quot;:&quot;Real-life scene of a modern minimalist home kitchen, built-in steam oven and under-counter water purifier, warm white soft lighting, light gray marble countertop with white cabinets, clean and transparent picture with a real life atmosphere, vertical screen composition&quot;,&quot;BackgroundMediaId&quot;:&quot;<Media asset ID>&quot;,&quot;BackgroundMediaUrl&quot;:&quot;<a href="https://example.com/bg.jpg%22%7D%7D">https://example.com/bg.jpg&quot;}}</a></p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The output languages. The value is a JSON array string. Valid values: CN, EN, and YUE. The <code>avatar-broadcast</code> and <code>creator-sales</code> scenes only support Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;CN\&quot;,\&quot;EN\&quot;,\&quot;YUE\&quot;]</p>
     */
    @NameInMap("OutputLanguages")
    public String outputLanguages;

    /**
     * <p>The resolution. Valid values:</p>
     * <ul>
     * <li>1080P</li>
     * <li>720P (default)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The scene type. Valid values:</p>
     * <ul>
     * <li>briefing-voiceover: News broadcast (supplements video footage based on the voiceover or uses no digital human).</li>
     * <li>creator-talk: Creator explanation (multiple shots for news, science, or finance).</li>
     * <li>creator-sales: Creator product promotion (three-part structure for product promotion, reviews, or store visits).</li>
     * <li>avatar-broadcast: Digital human broadcast (fixed single shot for broadcasts, announcements, or templates).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>creator-sales</p>
     */
    @NameInMap("SceneType")
    public String sceneType;

    /**
     * <p>The custom parameters. The value is a JSON string. The value is returned as-is in query or callback results. The maximum length is 8,192 characters. System reserved words:</p>
     * <ul>
     * <li>NotifyAddress: The callback URL. The URL must use the HTTP or HTTPS protocol. The maximum length is 2,048 characters. The callback is triggered after the node reaches the desired state.</li>
     * <li>UserId: The UID of the actual resource ownership. If this field is missing, the system falls back to CallerUid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12374214127312673137132</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The list of user materials. The value is a JSON array string. This parameter includes the following fields:</p>
     * <ul>
     * <li>MediaId: The media asset ID. This is the ID of the image or video uploaded to the platform.</li>
     * <li>Type: The media type.</li>
     * <li>Action: The method of using the material. Valid values: <code>match</code> (matches suitable clips from the video material based on the voiceover) and <code>insert</code> (inserts the video material before the CTA shot. This is intelligently analyzed after shots are generated based on the voiceover. This value is valid only for videos). Default value: <code>match</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Type\&quot;:\&quot;video\&quot;,\&quot;MediaId\&quot;:\&quot;xxxxxxxx\&quot;,\&quot;Action\&quot;:\&quot;match\&quot;}]</p>
     */
    @NameInMap("UserMaterials")
    public String userMaterials;

    /**
     * <p>Specifies whether to include subtitles. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithSubtitles")
    public Boolean withSubtitles;

    public static SubmitVideoCreativeGenerationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoCreativeGenerationJobRequest self = new SubmitVideoCreativeGenerationJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoCreativeGenerationJobRequest setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public SubmitVideoCreativeGenerationJobRequest setAvatarData(String avatarData) {
        this.avatarData = avatarData;
        return this;
    }
    public String getAvatarData() {
        return this.avatarData;
    }

    public SubmitVideoCreativeGenerationJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitVideoCreativeGenerationJobRequest setOutputLanguages(String outputLanguages) {
        this.outputLanguages = outputLanguages;
        return this;
    }
    public String getOutputLanguages() {
        return this.outputLanguages;
    }

    public SubmitVideoCreativeGenerationJobRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public SubmitVideoCreativeGenerationJobRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public SubmitVideoCreativeGenerationJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitVideoCreativeGenerationJobRequest setUserMaterials(String userMaterials) {
        this.userMaterials = userMaterials;
        return this;
    }
    public String getUserMaterials() {
        return this.userMaterials;
    }

    public SubmitVideoCreativeGenerationJobRequest setWithSubtitles(Boolean withSubtitles) {
        this.withSubtitles = withSubtitles;
        return this;
    }
    public Boolean getWithSubtitles() {
        return this.withSubtitles;
    }

}
