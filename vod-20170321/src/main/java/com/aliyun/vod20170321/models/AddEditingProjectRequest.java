// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectRequest extends TeaModel {
    /**
     * <p>The thumbnail URL of the online editing project. If you do not specify this parameter and the video track in the timeline has mezzanine files, the thumbnail of the first mezzanine file in the timeline is used.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://demo.aliyundoc.com/6AB4D0E1E1C74468883516C2349D1FC2-6-2.png">https://demo.aliyundoc.com/6AB4D0E1E1C74468883516C2349D1FC2-6-2.png</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <p>The description of the online editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>testtimeline001desciption</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The region where you want to create the online editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Division")
    public String division;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    /**
     * <p>The timeline of the online editing project, in JSON format. For more information about the structure, see <a href="https://help.aliyun.com/document_detail/52839.html">Timeline</a>.</p>
     * <p>If you do not specify this parameter, an empty timeline is created and the duration of the online editing project is zero.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;cc3308ac5006aed55a54328bc3443****&quot;},{&quot;MediaId&quot;:&quot;95948ddba24446b6aed5db985e78****&quot;}]}]}</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>The title of the online editing project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testtimeline</p>
     */
    @NameInMap("Title")
    public String title;

    public static AddEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectRequest self = new AddEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public AddEditingProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddEditingProjectRequest setDivision(String division) {
        this.division = division;
        return this;
    }
    public String getDivision() {
        return this.division;
    }

    public AddEditingProjectRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddEditingProjectRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AddEditingProjectRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddEditingProjectRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public AddEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
