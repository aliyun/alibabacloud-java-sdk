// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeStoryboardJobRequest extends TeaModel {
    /**
     * <p>The aspect ratio of the output video. Valid values:</p>
     * <ul>
     * <li>16:9</li>
     * <li>9:16</li>
     * <li>4:3</li>
     * <li>3:4</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4:3</p>
     */
    @NameInMap("AspectRatio")
    public String aspectRatio;

    /**
     * <p>The execution mode for storyboard generation. Valid values:</p>
     * <ul>
     * <li>FullPipeline: full pipeline generation, which includes storyboard generation and shot video generation.</li>
     * <li>StoryboardOnly: generates only the storyboard.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullPipeline</p>
     */
    @NameInMap("ExecMode")
    public String execMode;

    /**
     * <p>The OSS URL of the file. The URL must point to a file with a .txt or .doc extension.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://test.oss-cn-shanghai.aliyuncs.com/test.txt">http://test.oss-cn-shanghai.aliyuncs.com/test.txt</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <p>Specifies whether to retain the original dialogue during final video composition. Default value: True.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("KeepOriginDialogue")
    public Boolean keepOriginDialogue;

    /**
     * <p>The model parameters in JSON format.</p>
     * <p>&quot;AudioEnable&quot;: false disables audio.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;AudioEnable&quot;: false
     * }</p>
     */
    @NameInMap("ModelParams")
    public String modelParams;

    /**
     * <p>The narration voice ID. Valid values:</p>
     * <ul>
     * <li>sys_GracefulPoisedWoman: mature graceful female</li>
     * <li>sys_ElderlyWistfulWoman: wistful elderly female</li>
     * <li>sys_SweetBrightGirl: sweet bright girl</li>
     * <li>sys_YoungGracefulWoman: gentle graceful female</li>
     * <li>sys_MaturePoisedWoman: poised mature female</li>
     * <li>sys_MatureWiseWoman: elegant wise female</li>
     * <li>sys_CalmDeepMale: calm deep male</li>
     * <li>sys_SereneIntellect: serene intellectual male</li>
     * <li>sys_MajesticBaritone: majestic baritone male</li>
     * <li>sys_GravellySoulful: gravelly soulful male</li>
     * <li>sys_ClassicYoungMan: classic narrator male</li>
     * <li>sys_WiseYoungMan: wise narrator male</li>
     * <li>sys_ClassicYoungWoman: classic narrator female</li>
     * <li>sys_IntellectualYoungWoman: intellectual narrator female</li>
     * <li>sys_GentleYoungMan: gentle narrator male</li>
     * <li>sys_thoughtfulBoy: thoughtful boy</li>
     * <li>sys_RichBassMale: rich bass male</li>
     * <li>sys_ClassicMiddleAgedWoman: classic middle-aged narrator female</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sys_YoungGracefulWoman</p>
     */
    @NameInMap("NarrationVoiceId")
    public String narrationVoiceId;

    @NameInMap("NeedCaption")
    public Boolean needCaption;

    /**
     * <p>The resolution of the output video. Valid values:</p>
     * <ul>
     * <li>720P</li>
     * <li>1080P</li>
     * <li>2K</li>
     * <li>4K</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    @NameInMap("ShotPromptLang")
    public String shotPromptLang;

    /**
     * <p>The storyboard shot generation mode. Valid values:</p>
     * <ul>
     * <li>multi: multi-reference video generation</li>
     * <li>default: image-to-video generation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>multi</p>
     */
    @NameInMap("ShotPromptMode")
    public String shotPromptMode;

    /**
     * <p>The shot split mode. Valid values:</p>
     * <ul>
     * <li>firstPersonNarration: narration commentary mode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>firstPersonNarration</p>
     */
    @NameInMap("ShotSplitMode")
    public String shotSplitMode;

    /**
     * <p>Specifies whether to skip failed shots. Default value: True.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("SkipFailureShot")
    public Boolean skipFailureShot;

    /**
     * <p>The type of the material source. Valid values:</p>
     * <ul>
     * <li>Novel: novel</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Novel</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The storyboard style ID. Valid values:</p>
     * <ul>
     * <li>RealisticPhotographyPro: realistic photography Pro</li>
     * <li>RealisticGuzhuangPro: realistic ancient costume Pro</li>
     * <li>RealisticXianxiaPro: realistic Xianxia Pro</li>
     * <li>RealisticWesternPro: Western realistic Pro</li>
     * <li>RealisticPhotography: realistic photography</li>
     * <li>RealisticGuzhuang: realistic ancient costume</li>
     * <li>RealisticXianxia: realistic Xianxia</li>
     * <li>RealisticWasteland: realistic wasteland</li>
     * <li>RealisticEra: realistic vintage</li>
     * <li>GuofengAnime: 2D Chinese-style anime</li>
     * <li>GuofengAnime3D: 3D Chinese-style anime</li>
     * <li>AncientRomanceAnime: anime ancient romance</li>
     * <li>PostApocalypticAnime: anime post-apocalyptic</li>
     * <li>Cartoon3D: 3D cartoon</li>
     * <li>Photorealistic3D: photorealistic 3D rendering</li>
     * <li>SciFiRealism: sci-fi realism</li>
     * <li>Chibi3D: 3D chibi</li>
     * <li>ShojoManga: Japanese manga</li>
     * <li>NewPeriodAnime: new era Japanese anime</li>
     * <li>FairyTale2D: 2D fairy tale</li>
     * <li>Wasteland2D: 2D wasteland</li>
     * <li>InkWuxia: ink wash Wuxia</li>
     * <li>ShadiaoMeme: panda head meme style</li>
     * <li>Chibi2D: 2D chibi</li>
     * <li>Ghibli: Ghibli</li>
     * <li>SciFiComic: cyberpunk</li>
     * <li>AmericanSuperhero: American superhero</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RealisticPhotography</p>
     */
    @NameInMap("StyleId")
    public String styleId;

    /**
     * <p>The task title. If not specified, a default title is automatically generated based on the date. The title cannot exceed 128 bytes in length and must be UTF-8 encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>test-title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom settings in JSON format. Fields include:</p>
     * <ul>
     * <li>NotifyAddress: the callback URL for task completion. MNS callbacks and HTTP callbacks are supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;NotifyAddress&quot;: &quot;<a href="https://www.callback.com">https://www.callback.com</a>&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The video model. Valid values:</p>
     * <ul>
     * <li>wan2.6-r2v-flash</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wan2.6-r2v-flash</p>
     */
    @NameInMap("VideoModel")
    public String videoModel;

    public static SubmitYikeStoryboardJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeStoryboardJobRequest self = new SubmitYikeStoryboardJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYikeStoryboardJobRequest setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public SubmitYikeStoryboardJobRequest setExecMode(String execMode) {
        this.execMode = execMode;
        return this;
    }
    public String getExecMode() {
        return this.execMode;
    }

    public SubmitYikeStoryboardJobRequest setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public SubmitYikeStoryboardJobRequest setKeepOriginDialogue(Boolean keepOriginDialogue) {
        this.keepOriginDialogue = keepOriginDialogue;
        return this;
    }
    public Boolean getKeepOriginDialogue() {
        return this.keepOriginDialogue;
    }

    public SubmitYikeStoryboardJobRequest setModelParams(String modelParams) {
        this.modelParams = modelParams;
        return this;
    }
    public String getModelParams() {
        return this.modelParams;
    }

    public SubmitYikeStoryboardJobRequest setNarrationVoiceId(String narrationVoiceId) {
        this.narrationVoiceId = narrationVoiceId;
        return this;
    }
    public String getNarrationVoiceId() {
        return this.narrationVoiceId;
    }

    public SubmitYikeStoryboardJobRequest setNeedCaption(Boolean needCaption) {
        this.needCaption = needCaption;
        return this;
    }
    public Boolean getNeedCaption() {
        return this.needCaption;
    }

    public SubmitYikeStoryboardJobRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public SubmitYikeStoryboardJobRequest setShotPromptLang(String shotPromptLang) {
        this.shotPromptLang = shotPromptLang;
        return this;
    }
    public String getShotPromptLang() {
        return this.shotPromptLang;
    }

    public SubmitYikeStoryboardJobRequest setShotPromptMode(String shotPromptMode) {
        this.shotPromptMode = shotPromptMode;
        return this;
    }
    public String getShotPromptMode() {
        return this.shotPromptMode;
    }

    public SubmitYikeStoryboardJobRequest setShotSplitMode(String shotSplitMode) {
        this.shotSplitMode = shotSplitMode;
        return this;
    }
    public String getShotSplitMode() {
        return this.shotSplitMode;
    }

    public SubmitYikeStoryboardJobRequest setSkipFailureShot(Boolean skipFailureShot) {
        this.skipFailureShot = skipFailureShot;
        return this;
    }
    public Boolean getSkipFailureShot() {
        return this.skipFailureShot;
    }

    public SubmitYikeStoryboardJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public SubmitYikeStoryboardJobRequest setStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }
    public String getStyleId() {
        return this.styleId;
    }

    public SubmitYikeStoryboardJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitYikeStoryboardJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitYikeStoryboardJobRequest setVideoModel(String videoModel) {
        this.videoModel = videoModel;
        return this;
    }
    public String getVideoModel() {
        return this.videoModel;
    }

}
