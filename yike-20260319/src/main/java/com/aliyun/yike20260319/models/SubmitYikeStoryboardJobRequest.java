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
     * <li>3:4.</li>
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
     * <li>FullPipeline: Full pipeline generation, which includes both storyboard generation and shot video generation.</li>
     * <li>StoryboardOnly: Generates only the storyboard.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullPipeline</p>
     */
    @NameInMap("ExecMode")
    public String execMode;

    /**
     * <p>The OSS URL of the file. Only URLs with the .txt or .doc file name extension are supported.</p>
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
     * <li>sys_GracefulPoisedWoman: Graceful Poised Woman</li>
     * <li>sys_ElderlyWistfulWoman: Elderly Wistful Woman</li>
     * <li>sys_SweetBrightGirl: Sweet Bright Girl</li>
     * <li>sys_YoungGracefulWoman: Young Graceful Woman</li>
     * <li>sys_MaturePoisedWoman: Mature Poised Woman</li>
     * <li>sys_MatureWiseWoman: Mature Wise Woman</li>
     * <li>sys_CalmDeepMale: Calm Deep Male</li>
     * <li>sys_SereneIntellect: Serene Intellect</li>
     * <li>sys_MajesticBaritone: Majestic Baritone</li>
     * <li>sys_GravellySoulful: Gravelly Soulful</li>
     * <li>sys_ClassicYoungMan: Classic Young Man Narrator</li>
     * <li>sys_WiseYoungMan: Wise Young Man Narrator</li>
     * <li>sys_ClassicYoungWoman: Classic Young Woman Narrator</li>
     * <li>sys_IntellectualYoungWoman: Intellectual Young Woman Narrator</li>
     * <li>sys_GentleYoungMan: Gentle Young Man Narrator</li>
     * <li>sys_thoughtfulBoy: Thoughtful Boy</li>
     * <li>sys_RichBassMale: Rich Bass Male</li>
     * <li>sys_ClassicMiddleAgedWoman: Classic Middle-Aged Woman Narrator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sys_YoungGracefulWoman</p>
     */
    @NameInMap("NarrationVoiceId")
    public String narrationVoiceId;

    /**
     * <p>The resolution of the output video. Valid values:</p>
     * <ul>
     * <li>720P</li>
     * <li>1080P</li>
     * <li>2K</li>
     * <li>4K.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The storyboard shot generation mode. Valid values:</p>
     * <ul>
     * <li>multi: multi-reference video generation</li>
     * <li>default: image-to-video generation.</li>
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
     * <li>firstPersonNarration: narration mode.</li>
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
     * <li>Novel: novel.</li>
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
     * <li>RealisticPhotographyPro: Realistic Photography Pro</li>
     * <li>RealisticGuzhuangPro: Realistic Ancient Costume Pro</li>
     * <li>RealisticXianxiaPro: Realistic Xianxia Pro</li>
     * <li>RealisticWesternPro: Western Realism Pro</li>
     * <li>RealisticPhotography: Realistic Photography</li>
     * <li>RealisticGuzhuang: Realistic Ancient Costume</li>
     * <li>RealisticXianxia: Realistic Xianxia</li>
     * <li>RealisticWasteland: Realistic Wasteland</li>
     * <li>RealisticEra: Realistic Vintage</li>
     * <li>GuofengAnime: 2D Chinese-style Anime</li>
     * <li>GuofengAnime3D: 3D Chinese-style Anime</li>
     * <li>AncientRomanceAnime: Anime Ancient Romance</li>
     * <li>PostApocalypticAnime: Anime Post-Apocalyptic</li>
     * <li>Cartoon3D: 3D Cartoon</li>
     * <li>Photorealistic3D: Photorealistic 3D Rendering</li>
     * <li>SciFiRealism: Sci-Fi Realism</li>
     * <li>Chibi3D: 3D Chibi</li>
     * <li>ShojoManga: Japanese Manga</li>
     * <li>NewPeriodAnime: New Era Japanese Anime</li>
     * <li>FairyTale2D: 2D Fairy Tale</li>
     * <li>Wasteland2D: 2D Wasteland</li>
     * <li>InkWuxia: Ink Wash Wuxia</li>
     * <li>ShadiaoMeme: Panda Head Meme</li>
     * <li>Chibi2D: 2D Chibi</li>
     * <li>Ghibli: Ghibli</li>
     * <li>SciFiComic: Cyberpunk</li>
     * <li>AmericanSuperhero: American Superhero.</li>
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
     * <p>The custom settings in JSON format.</p>
     * <ul>
     * <li>NotifyAddress specifies the callback for task completion. Both MNS callbacks and HTTP callbacks are supported.</li>
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
     * <li>wan2.6-r2v-flash.</li>
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

    public SubmitYikeStoryboardJobRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
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
