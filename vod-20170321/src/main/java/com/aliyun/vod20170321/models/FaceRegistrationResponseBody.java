// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class FaceRegistrationResponseBody extends TeaModel {
    @NameInMap("NonExistImageIds")
    public FaceRegistrationResponseBodyNonExistImageIds nonExistImageIds;

    @NameInMap("RegisteredPerson")
    public FaceRegistrationResponseBodyRegisteredPerson registeredPerson;

    @NameInMap("RequestId")
    public String requestId;

    public static FaceRegistrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceRegistrationResponseBody self = new FaceRegistrationResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceRegistrationResponseBody setNonExistImageIds(FaceRegistrationResponseBodyNonExistImageIds nonExistImageIds) {
        this.nonExistImageIds = nonExistImageIds;
        return this;
    }
    public FaceRegistrationResponseBodyNonExistImageIds getNonExistImageIds() {
        return this.nonExistImageIds;
    }

    public FaceRegistrationResponseBody setRegisteredPerson(FaceRegistrationResponseBodyRegisteredPerson registeredPerson) {
        this.registeredPerson = registeredPerson;
        return this;
    }
    public FaceRegistrationResponseBodyRegisteredPerson getRegisteredPerson() {
        return this.registeredPerson;
    }

    public FaceRegistrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FaceRegistrationResponseBodyNonExistImageIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static FaceRegistrationResponseBodyNonExistImageIds build(java.util.Map<String, ?> map) throws Exception {
            FaceRegistrationResponseBodyNonExistImageIds self = new FaceRegistrationResponseBodyNonExistImageIds();
            return TeaModel.build(map, self);
        }

        public FaceRegistrationResponseBodyNonExistImageIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class FaceRegistrationResponseBodyRegisteredPersonFacesFace extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Quality")
        public String quality;

        @NameInMap("Target")
        public String target;

        public static FaceRegistrationResponseBodyRegisteredPersonFacesFace build(java.util.Map<String, ?> map) throws Exception {
            FaceRegistrationResponseBodyRegisteredPersonFacesFace self = new FaceRegistrationResponseBodyRegisteredPersonFacesFace();
            return TeaModel.build(map, self);
        }

        public FaceRegistrationResponseBodyRegisteredPersonFacesFace setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public FaceRegistrationResponseBodyRegisteredPersonFacesFace setQuality(String quality) {
            this.quality = quality;
            return this;
        }
        public String getQuality() {
            return this.quality;
        }

        public FaceRegistrationResponseBodyRegisteredPersonFacesFace setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class FaceRegistrationResponseBodyRegisteredPersonFaces extends TeaModel {
        @NameInMap("Face")
        public java.util.List<FaceRegistrationResponseBodyRegisteredPersonFacesFace> face;

        public static FaceRegistrationResponseBodyRegisteredPersonFaces build(java.util.Map<String, ?> map) throws Exception {
            FaceRegistrationResponseBodyRegisteredPersonFaces self = new FaceRegistrationResponseBodyRegisteredPersonFaces();
            return TeaModel.build(map, self);
        }

        public FaceRegistrationResponseBodyRegisteredPersonFaces setFace(java.util.List<FaceRegistrationResponseBodyRegisteredPersonFacesFace> face) {
            this.face = face;
            return this;
        }
        public java.util.List<FaceRegistrationResponseBodyRegisteredPersonFacesFace> getFace() {
            return this.face;
        }

    }

    public static class FaceRegistrationResponseBodyRegisteredPerson extends TeaModel {
        @NameInMap("Faces")
        public FaceRegistrationResponseBodyRegisteredPersonFaces faces;

        @NameInMap("PersonId")
        public String personId;

        @NameInMap("PersonName")
        public String personName;

        public static FaceRegistrationResponseBodyRegisteredPerson build(java.util.Map<String, ?> map) throws Exception {
            FaceRegistrationResponseBodyRegisteredPerson self = new FaceRegistrationResponseBodyRegisteredPerson();
            return TeaModel.build(map, self);
        }

        public FaceRegistrationResponseBodyRegisteredPerson setFaces(FaceRegistrationResponseBodyRegisteredPersonFaces faces) {
            this.faces = faces;
            return this;
        }
        public FaceRegistrationResponseBodyRegisteredPersonFaces getFaces() {
            return this.faces;
        }

        public FaceRegistrationResponseBodyRegisteredPerson setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public FaceRegistrationResponseBodyRegisteredPerson setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

    }

}
