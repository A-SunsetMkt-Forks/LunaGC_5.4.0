// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntityMoveNotify.proto

package emu.grasscutter.net.proto;

public final class SceneEntityMoveNotifyOuterClass {
  private SceneEntityMoveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntityMoveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntityMoveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 reliable_seq = 5;</code>
     * @return The reliableSeq.
     */
    int getReliableSeq();

    /**
     * <code>.MotionInfo motion_info = 7;</code>
     * @return Whether the motionInfo field is set.
     */
    boolean hasMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 7;</code>
     * @return The motionInfo.
     */
    emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 7;</code>
     */
    emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder();

    /**
     * <code>uint32 scene_time = 11;</code>
     * @return The sceneTime.
     */
    int getSceneTime();

    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * Protobuf type {@code SceneEntityMoveNotify}
   */
  public static final class SceneEntityMoveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntityMoveNotify)
      SceneEntityMoveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntityMoveNotify.newBuilder() to construct.
    private SceneEntityMoveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntityMoveNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntityMoveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneEntityMoveNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {

              reliableSeq_ = input.readUInt32();
              break;
            }
            case 58: {
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder subBuilder = null;
              if (motionInfo_ != null) {
                subBuilder = motionInfo_.toBuilder();
              }
              motionInfo_ = input.readMessage(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(motionInfo_);
                motionInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 88: {

              sceneTime_ = input.readUInt32();
              break;
            }
            case 104: {

              entityId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.class, emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.Builder.class);
    }

    public static final int RELIABLE_SEQ_FIELD_NUMBER = 5;
    private int reliableSeq_;
    /**
     * <code>uint32 reliable_seq = 5;</code>
     * @return The reliableSeq.
     */
    @java.lang.Override
    public int getReliableSeq() {
      return reliableSeq_;
    }

    public static final int MOTION_INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
    /**
     * <code>.MotionInfo motion_info = 7;</code>
     * @return Whether the motionInfo field is set.
     */
    @java.lang.Override
    public boolean hasMotionInfo() {
      return motionInfo_ != null;
    }
    /**
     * <code>.MotionInfo motion_info = 7;</code>
     * @return The motionInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
      return motionInfo_ == null ? emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
    }
    /**
     * <code>.MotionInfo motion_info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
      return getMotionInfo();
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 11;
    private int sceneTime_;
    /**
     * <code>uint32 scene_time = 11;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 13;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (reliableSeq_ != 0) {
        output.writeUInt32(5, reliableSeq_);
      }
      if (motionInfo_ != null) {
        output.writeMessage(7, getMotionInfo());
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(11, sceneTime_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(13, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reliableSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, reliableSeq_);
      }
      if (motionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getMotionInfo());
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, sceneTime_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, entityId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify other = (emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify) obj;

      if (getReliableSeq()
          != other.getReliableSeq()) return false;
      if (hasMotionInfo() != other.hasMotionInfo()) return false;
      if (hasMotionInfo()) {
        if (!getMotionInfo()
            .equals(other.getMotionInfo())) return false;
      }
      if (getSceneTime()
          != other.getSceneTime()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RELIABLE_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getReliableSeq();
      if (hasMotionInfo()) {
        hash = (37 * hash) + MOTION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMotionInfo().hashCode();
      }
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code SceneEntityMoveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntityMoveNotify)
        emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.class, emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reliableSeq_ = 0;

        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }
        sceneTime_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.internal_static_SceneEntityMoveNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify build() {
        emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify buildPartial() {
        emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify result = new emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify(this);
        result.reliableSeq_ = reliableSeq_;
        if (motionInfoBuilder_ == null) {
          result.motionInfo_ = motionInfo_;
        } else {
          result.motionInfo_ = motionInfoBuilder_.build();
        }
        result.sceneTime_ = sceneTime_;
        result.entityId_ = entityId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify other) {
        if (other == emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify.getDefaultInstance()) return this;
        if (other.getReliableSeq() != 0) {
          setReliableSeq(other.getReliableSeq());
        }
        if (other.hasMotionInfo()) {
          mergeMotionInfo(other.getMotionInfo());
        }
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reliableSeq_ ;
      /**
       * <code>uint32 reliable_seq = 5;</code>
       * @return The reliableSeq.
       */
      @java.lang.Override
      public int getReliableSeq() {
        return reliableSeq_;
      }
      /**
       * <code>uint32 reliable_seq = 5;</code>
       * @param value The reliableSeq to set.
       * @return This builder for chaining.
       */
      public Builder setReliableSeq(int value) {
        
        reliableSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reliable_seq = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReliableSeq() {
        
        reliableSeq_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> motionInfoBuilder_;
      /**
       * <code>.MotionInfo motion_info = 7;</code>
       * @return Whether the motionInfo field is set.
       */
      public boolean hasMotionInfo() {
        return motionInfoBuilder_ != null || motionInfo_ != null;
      }
      /**
       * <code>.MotionInfo motion_info = 7;</code>
       * @return The motionInfo.
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
        if (motionInfoBuilder_ == null) {
          return motionInfo_ == null ? emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        } else {
          return motionInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.MotionInfo motion_info = 7;</code>
       */
      public Builder setMotionInfo(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          motionInfo_ = value;
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 7;</code>
       */
      public Builder setMotionInfo(
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder builderForValue) {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = builderForValue.build();
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 7;</code>
       */
      public Builder mergeMotionInfo(emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (motionInfo_ != null) {
            motionInfo_ =
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.newBuilder(motionInfo_).mergeFrom(value).buildPartial();
          } else {
            motionInfo_ = value;
          }
          onChanged();
        } else {
          motionInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 7;</code>
       */
      public Builder clearMotionInfo() {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
          onChanged();
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 7;</code>
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder getMotionInfoBuilder() {
        
        onChanged();
        return getMotionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MotionInfo motion_info = 7;</code>
       */
      public emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
        if (motionInfoBuilder_ != null) {
          return motionInfoBuilder_.getMessageOrBuilder();
        } else {
          return motionInfo_ == null ?
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        }
      }
      /**
       * <code>.MotionInfo motion_info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> 
          getMotionInfoFieldBuilder() {
        if (motionInfoBuilder_ == null) {
          motionInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.grasscutter.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder>(
                  getMotionInfo(),
                  getParentForChildren(),
                  isClean());
          motionInfo_ = null;
        }
        return motionInfoBuilder_;
      }

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 11;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 11;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {
        
        sceneTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        
        sceneTime_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SceneEntityMoveNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneEntityMoveNotify)
    private static final emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify();
    }

    public static emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntityMoveNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntityMoveNotify>() {
      @java.lang.Override
      public SceneEntityMoveNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneEntityMoveNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneEntityMoveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntityMoveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneEntityMoveNotifyOuterClass.SceneEntityMoveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntityMoveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntityMoveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SceneEntityMoveNotify.proto\032\020MotionInf" +
      "o.proto\"v\n\025SceneEntityMoveNotify\022\024\n\014reli" +
      "able_seq\030\005 \001(\r\022 \n\013motion_info\030\007 \001(\0132\013.Mo" +
      "tionInfo\022\022\n\nscene_time\030\013 \001(\r\022\021\n\tentity_i" +
      "d\030\r \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MotionInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneEntityMoveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntityMoveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntityMoveNotify_descriptor,
        new java.lang.String[] { "ReliableSeq", "MotionInfo", "SceneTime", "EntityId", });
    emu.grasscutter.net.proto.MotionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
